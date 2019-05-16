package com.czl.pojo;

import java.io.Serializable;

public class Paymentmanage implements Serializable {
    private Integer paymentid;

    private Integer userid;

    private Integer ordernumber;

    private Integer consumptionid;

    private Integer totalprice;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getConsumptionid() {
        return consumptionid;
    }

    public void setConsumptionid(Integer consumptionid) {
        this.consumptionid = consumptionid;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }
}