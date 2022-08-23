package com.kai.bean;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class RequestData implements Serializable {

    /**
     * 取车城市
     */
    private String pickupCityId;

    /**
     * 还车城市
     */
    private String returnCityId;

    /**
     * 取车时间
     * yyyy-MM-dd HH:mm
     */
    private String pickupTime;

    /**
     * 还车时间
     * yyyy-MM-dd HH:mm
     */
    private String returnTime;

    /**
     * 调用入口
     */
    private Integer entrance;

    /**
     * 门店id
     */
    private Integer pickupDeptId;

    private Integer holidaysWaitingFlag;

    public RequestData(String pickupCityId, String returnCityId, Date pickupTime, Date returnTime, Integer pickupDeptId) {
        this.pickupCityId = pickupCityId;
        this.returnCityId = returnCityId;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.pickupTime = simpleDateFormat.format(pickupTime);
        this.returnTime = simpleDateFormat.format(returnTime);
        this.entrance = 1;
        this.pickupDeptId = pickupDeptId;
        this.holidaysWaitingFlag = 0;
    }

    public RequestData(String pickupCityId, Date pickupTime, Date returnTime, Integer pickupDeptId) {
        this.pickupCityId = pickupCityId;
        this.returnCityId = pickupCityId;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.pickupTime = simpleDateFormat.format(pickupTime);
        this.returnTime = simpleDateFormat.format(returnTime);
        this.entrance = 1;
        this.pickupDeptId = pickupDeptId;
        this.holidaysWaitingFlag = 0;
    }
}
