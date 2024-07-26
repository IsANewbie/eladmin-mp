
package com.dgm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dgm.domain.GenConfig;

/**
 * @author Zheng Jie
 * @date 2019-01-14
 */
public interface GenConfigService extends IService<GenConfig> {

    /**
     * 查询表配置
     * @param tableName 表名
     * @return 表配置
     */
    GenConfig find(String tableName);

    /**
     * 更新表配置
     * @param tableName 表名
     * @param genConfig 表配置
     * @return 表配置
     */
    GenConfig update(String tableName, GenConfig genConfig);
}
