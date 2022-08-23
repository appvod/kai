package com.kai.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ModelItem implements Serializable {

    private String modelName;

    private String lowPriceDesc;

    private String modelImgUrl;

    private Integer modelId;

}
