package com.kai.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Content implements Serializable {

    private List<ModelGroup> modelGroups;

    private String notSuitDeptTips;

    private Integer deptTotalNum;

    private Integer deptDataType;

    private List<DeptHangModel> deptHangModels;

}
