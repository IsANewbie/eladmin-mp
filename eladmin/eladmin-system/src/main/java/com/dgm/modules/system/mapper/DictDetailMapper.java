
package com.dgm.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dgm.modules.system.domain.DictDetail;
import com.dgm.modules.system.domain.vo.DictDetailQueryCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Set;

/**
* @author Zheng Jie
* @date 2023-06-19
*/
@Mapper
public interface DictDetailMapper extends BaseMapper<DictDetail> {

    List<DictDetail> findByDictName(@Param("name") String name);

    IPage<DictDetail> findAll(@Param("criteria") DictDetailQueryCriteria criteria, Page<Object> page);

    void deleteByDictBatchIds(@Param("dictIds") Set<Long> dictIds);
}