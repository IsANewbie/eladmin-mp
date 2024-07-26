
package com.dgm.modules.system.mapper;

import com.dgm.modules.system.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Set;

/**
 * @author Zheng Jie
 * @date 2023-06-20
 */
@Mapper
public interface RoleDeptMapper {
    void insertData(@Param("roleId") Long roleId, @Param("depts") Set<Dept> depts);

    void deleteByRoleId(@Param("roleId") Long roleId);

    void deleteByRoleIds(@Param("roleIds") Set<Long> roleIds);
}
