package com.czl.dto;

import com.czl.pojo.Roommanage;

import java.io.Serializable;
import java.sql.Timestamp;

public class SelectRoom implements Serializable {

    private int roomid;

    private String roomnum;

    private int roomfloor;

    private String roomdesc;

    private String roomimg;

    private Timestamp chickin;

    private Timestamp chickout;

    private String roomstate;

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public int getRoomfloor() {
        return roomfloor;
    }

    public void setRoomfloor(int roomfloor) {
        this.roomfloor = roomfloor;
    }

    public String getRoomdesc() {
        return roomdesc;
    }

    public void setRoomdesc(String roomdesc) {
        this.roomdesc = roomdesc;
    }

    public String getRoomimg() {
        return roomimg;
    }

    public void setRoomimg(String roomimg) {
        this.roomimg = roomimg;
    }

    public Timestamp getChickin() {
        return chickin;
    }

    public void setChickin(Timestamp chickin) {
        this.chickin = chickin;
    }

    public Timestamp getChickout() {
        return chickout;
    }

    public void setChickout(Timestamp chickout) {
        this.chickout = chickout;
    }

    public String getRoomstate() {
        return roomstate;
    }

    public void setRoomstate(String roomstate) {
        this.roomstate = roomstate;
    }

    @Override
    public String toString() {
        return "SelectRoom{" +
                "roomid=" + roomid +
                ", roomnum='" + roomnum + '\'' +
                ", roomfloor=" + roomfloor +
                ", roomdesc='" + roomdesc + '\'' +
                ", roomimg='" + roomimg + '\'' +
                ", chickin=" + chickin +
                ", chickout=" + chickout +
                ", roomstate='" + roomstate + '\'' +
                '}';
    }
}
