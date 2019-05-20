package com.czl.pojo;

import java.io.Serializable;

public class Consumeinfo implements Serializable {
    private Integer consumeid;

    private Integer commodityid;

    private static final long serialVersionUID = 1L;

    public Integer getConsumeid() {
        return consumeid;
    }

    public void setConsumeid(Integer consumeid) {
        this.consumeid = consumeid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }
}