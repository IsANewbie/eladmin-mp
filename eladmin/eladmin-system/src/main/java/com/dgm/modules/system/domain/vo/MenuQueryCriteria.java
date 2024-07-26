
package com.dgm.modules.system.domain.vo;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Zheng Jie
 * 公共查询类
 */
@Data
public class MenuQueryCriteria {

    private String blurry;

    private List<Timestamp> createTime;

    private Boolean pidIsNull;

    private Long pid;
}
