package com.kai.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ModelGroup implements Serializable {

    private String lowPriceDesc;

    private String name;

    private Integer sortNum;

    private Integer groupId;

    private List<ModelItem> modelItems;

}
