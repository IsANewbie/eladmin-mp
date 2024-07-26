
package com.dgm.modules.system.domain.vo;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Data
public class DeptQueryCriteria{

    private List<Long> ids;

    private String name;

    private Boolean enabled;

    private Long pid;

    private Boolean pidIsNull;

    private List<Timestamp> createTime;
}