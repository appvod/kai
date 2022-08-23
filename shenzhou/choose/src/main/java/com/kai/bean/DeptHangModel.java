package com.kai.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DeptHangModel implements Serializable {

    private String modelCountDesc;

    private String deptName;

    private List<Model> models;

    private Boolean chainFlag;

    private Integer deptId;

    private String lon, lat;

    private Integer cityId;

    private String workTime;

    private Integer pickupAppropriate, deptDistanceDouble;

    private Integer pickupWebsite;

    private Boolean wholeDayFlag;

    private String deptDistance;

    private String deptAddress;

}
