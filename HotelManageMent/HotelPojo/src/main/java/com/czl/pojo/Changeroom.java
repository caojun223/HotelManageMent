package com.czl.pojo;

import java.io.Serializable;

public class Changeroom implements Serializable {
    private Integer hangeid;

    private Integer userid;

    private Integer roomid;

    private Integer bookid;

    private String cause;

    private static final long serialVersionUID = 1L;

    public Integer getHangeid() {
        return hangeid;
    }

    public void setHangeid(Integer hangeid) {
        this.hangeid = hangeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }
}