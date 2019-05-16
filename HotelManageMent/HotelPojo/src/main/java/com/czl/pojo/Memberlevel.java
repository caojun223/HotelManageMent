package com.czl.pojo;

import java.io.Serializable;

public class Memberlevel implements Serializable {
    private Integer levelid;

    private String levelname;

    private Double leveldiscount;

    private Integer levelpoints;

    private static final long serialVersionUID = 1L;

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public Double getLeveldiscount() {
        return leveldiscount;
    }

    public void setLeveldiscount(Double leveldiscount) {
        this.leveldiscount = leveldiscount;
    }

    public Integer getLevelpoints() {
        return levelpoints;
    }

    public void setLevelpoints(Integer levelpoints) {
        this.levelpoints = levelpoints;
    }
}