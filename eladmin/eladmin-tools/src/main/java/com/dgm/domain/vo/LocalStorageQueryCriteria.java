
package com.dgm.domain.vo;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

/**
* @author Zheng Jie
* @date 2019-09-05
*/
@Data
public class LocalStorageQueryCriteria{

    private String blurry;

    private List<Timestamp> createTime;
}