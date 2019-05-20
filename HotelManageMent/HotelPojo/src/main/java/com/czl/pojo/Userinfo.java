package com.czl.pojo;

import java.io.Serializable;

public class Userinfo implements Serializable {
    private Integer userid;

    private String username;

    private String userpass;

    private String usersex;

    private String usertel;

    private String usercarttype;

    private String usercart;

    private String userstate;

    private Integer userpoints;

    private Integer levelid;

    private String useremail;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUsercarttype() {
        return usercarttype;
    }

    public void setUsercarttype(String usercarttype) {
        this.usercarttype = usercarttype == null ? null : usercarttype.trim();
    }

    public String getUsercart() {
        return usercart;
    }

    public void setUsercart(String usercart) {
        this.usercart = usercart == null ? null : usercart.trim();
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate == null ? null : userstate.trim();
    }

    public Integer getUserpoints() {
        return userpoints;
    }

    public void setUserpoints(Integer userpoints) {
        this.userpoints = userpoints;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", usersex='" + usersex + '\'' +
                ", usertel='" + usertel + '\'' +
                ", usercarttype='" + usercarttype + '\'' +
                ", usercart='" + usercart + '\'' +
                ", userstate='" + userstate + '\'' +
                ", userpoints=" + userpoints +
                ", levelid=" + levelid +
                ", useremail='" + useremail + '\'' +
                '}';
    }
}