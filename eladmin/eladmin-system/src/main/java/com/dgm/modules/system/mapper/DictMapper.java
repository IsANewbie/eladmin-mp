
package com.dgm.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dgm.modules.system.domain.Dict;
import com.dgm.modules.system.domain.vo.DictQueryCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
* @author Zheng Jie
* @date 2023-06-19
*/
@Mapper
public interface DictMapper extends BaseMapper<Dict> {

    List<Dict> findAll(@Param("criteria") DictQueryCriteria criteria);

    Long countAll(@Param("criteria") DictQueryCriteria criteria);
}