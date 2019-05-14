package com.czl.pojo;

import java.io.Serializable;

public class Serviceinfo implements Serializable {
    private Integer serviceid;

    private String servicename;

    private static final long serialVersionUID = 1L;

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }
}