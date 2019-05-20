package com.czl.pojo;

import java.io.Serializable;
import java.util.Date;

public class Bookinfo implements Serializable {
    private Integer bookid;

    private String username;

    private String useremail;

    private Date chickin;

    private Date chickout;

    private Integer typeid;

    private static final long serialVersionUID = 1L;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Date getChickin() {
        return chickin;
    }

    public void setChickin(Date chickin) {
        this.chickin = chickin;
    }

    public Date getChickout() {
        return chickout;
    }

    public void setChickout(Date chickout) {
        this.chickout = chickout;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}