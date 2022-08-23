package com.kai.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class GwResultParent implements Serializable {

    protected String busiCode;

    protected Integer code;

    protected String msg;

    protected String status;

    protected String uid;

    public boolean isSuccess() {
        return "SUCCESS".equals(this.getStatus());
    }

}
