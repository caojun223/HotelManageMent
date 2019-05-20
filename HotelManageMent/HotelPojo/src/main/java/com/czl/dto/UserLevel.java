package com.czl.dto;

import java.io.Serializable;

public class UserLevel implements Serializable {
    private int UserId;
    private String UserName;
    private String UserPoints;
    private String userlevel;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPoints() {
        return UserPoints;
    }

    public void setUserPoints(String userPoints) {
        UserPoints = userPoints;
    }

    public String getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(String userlevel) {
        this.userlevel = userlevel;
    }

    @Override
    public String toString() {
        return "UserLevel{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserPoints='" + UserPoints + '\'' +
                ", userlevel='" + userlevel + '\'' +
                '}';
    }
}
