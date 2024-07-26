
package com.dgm.modules.system.mapper;

import com.dgm.modules.system.domain.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Set;

/**
 * @author Zheng Jie
 * @date 2023-06-20
 */
@Mapper
public interface RoleMenuMapper {
    void insertData(@Param("roleId") Long roleId, @Param("menus") Set<Menu> menus);

    void deleteByRoleId(@Param("roleId") Long roleId);

    void deleteByRoleIds(@Param("roleIds") Set<Long> roleIds);

    void deleteByMenuId(@Param("menuId") Long menuId);
}
