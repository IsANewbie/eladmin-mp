
package com.dgm.modules.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dgm.modules.system.domain.DictDetail;
import com.dgm.modules.system.domain.vo.DictDetailQueryCriteria;
import com.dgm.utils.PageResult;

import java.util.List;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
public interface DictDetailService extends IService<DictDetail> {

    /**
     * 创建
     * @param resources /
     */
    void create(DictDetail resources);

    /**
     * 编辑
     * @param resources /
     */
    void update(DictDetail resources);

    /**
     * 删除
     * @param id /
     */
    void delete(Long id);

    /**
     * 分页查询
     *
     * @param criteria 条件
     * @param page     分页参数
     * @return /
     */
    PageResult<DictDetail> queryAll(DictDetailQueryCriteria criteria, Page<Object> page);

    /**
     * 根据字典名称获取字典详情
     * @param name 字典名称
     * @return /
     */
    List<DictDetail> getDictByName(String name);
}