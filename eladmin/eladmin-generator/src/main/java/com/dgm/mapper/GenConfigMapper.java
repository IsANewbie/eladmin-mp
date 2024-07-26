
package com.dgm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dgm.domain.GenConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Zheng Jie
 * @date 2023-06-26
 */
@Mapper
public interface GenConfigMapper extends BaseMapper<GenConfig> {

    GenConfig findByTableName(@Param("tableName") String tableName);
}
