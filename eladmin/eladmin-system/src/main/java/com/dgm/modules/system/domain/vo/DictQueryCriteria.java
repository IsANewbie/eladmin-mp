
package com.dgm.modules.system.domain.vo;

import lombok.Data;

/**
 * @author Zheng Jie
 * 公共查询类
 */
@Data
public class DictQueryCriteria {

    private String blurry;

    private Long offset;

    private Long size;
}
