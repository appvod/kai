package com.kai.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Model implements Serializable {

    private Integer modelGroupId, inventoryType, modelId;

    private String dailyPrice, packagePrice, lowPrice;

    private String modelLabel, modelName, modelImgUrl, modelDesc;

    private Integer modelGroupSort;

    private Boolean bookFlag, selfServiceFlag, havePriceFlag, lightSpotFlag;

}
