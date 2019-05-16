package com.czl.pojo;

import java.io.Serializable;

public class Commodity implements Serializable {
    private Integer commodityid;

    private String commodityname;

    private Integer commodityprice;

    private static final long serialVersionUID = 1L;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(Integer commodityprice) {
        this.commodityprice = commodityprice;
    }
}