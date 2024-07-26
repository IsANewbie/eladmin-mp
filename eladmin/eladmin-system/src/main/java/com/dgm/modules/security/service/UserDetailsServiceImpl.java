
package com.dgm.modules.security.service;

import com.dgm.modules.security.service.dto.JwtUserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.dgm.exception.BadRequestException;
import com.dgm.exception.EntityNotFoundException;
import com.dgm.modules.system.domain.User;
import com.dgm.modules.system.service.DataService;
import com.dgm.modules.system.service.RoleService;
import com.dgm.modules.system.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Zheng Jie
 * @date 2018-11-22
 */
@Slf4j
@RequiredArgsConstructor
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;
    private final RoleService roleService;
    private final DataService dataService;
    private final UserCacheManager userCacheManager;

    @Override
    public JwtUserDto loadUserByUsername(String username) {
        JwtUserDto jwtUserDto = userCacheManager.getUserCache(username);
        if(jwtUserDto == null){
            User user;
            try {
                user = userService.getLoginData(username);
            } catch (EntityNotFoundException e) {
                // SpringSecurity会自动转换UsernameNotFoundException为BadCredentialsException
                throw new UsernameNotFoundException(username, e);
            }
            if (user == null) {
                throw new UsernameNotFoundException("");
            } else {
                if (!user.getEnabled()) {
                    throw new BadRequestException("账号未激活！");
                }
                jwtUserDto = new JwtUserDto(
                        user,
                        dataService.getDeptIds(user),
                        roleService.mapToGrantedAuthorities(user)
                );
                // 添加缓存数据
                userCacheManager.addUserCache(username, jwtUserDto);
            }
        }
        return jwtUserDto;
    }
}
