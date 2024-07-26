
package com.dgm.modules.quartz.domain.vo;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Zheng Jie
 * @date 2019-6-4 10:33:02
 */
@Data
public class QuartzJobQueryCriteria {

    private String jobName;

    private Boolean isSuccess;

    private List<Timestamp> createTime;
}
