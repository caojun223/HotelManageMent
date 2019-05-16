package com.czl.pojo;



import java.io.Serializable;



public class Roommanage implements Serializable {

    private Integer roomid;



    private String roomnum;



    private Integer roomfloor;



    private String roomimg;



    private String roomdesc;



    private Double roomprice;



    private String roomstate;



    private String typeid;



    private static final long serialVersionUID = 1L;



    public Integer getRoomid() {

        return roomid;

    }



    public void setRoomid(Integer roomid) {

        this.roomid = roomid;

    }



    public String getRoomnum() {

        return roomnum;

    }



    public void setRoomnum(String roomnum) {

        this.roomnum = roomnum == null ? null : roomnum.trim();

    }



    public Integer getRoomfloor() {

        return roomfloor;

    }



    public void setRoomfloor(Integer roomfloor) {

        this.roomfloor = roomfloor;

    }



    public String getRoomimg() {

        return roomimg;

    }



    public void setRoomimg(String roomimg) {

        this.roomimg = roomimg == null ? null : roomimg.trim();

    }



    public String getRoomdesc() {

        return roomdesc;

    }



    public void setRoomdesc(String roomdesc) {

        this.roomdesc = roomdesc == null ? null : roomdesc.trim();

    }



    public Double getRoomprice() {

        return roomprice;

    }



    public void setRoomprice(Double roomprice) {

        this.roomprice = roomprice;

    }



    public String getRoomstate() {

        return roomstate;

    }



    public void setRoomstate(String roomstate) {

        this.roomstate = roomstate == null ? null : roomstate.trim();

    }



    public String getTypeid() {

        return typeid;

    }



    public void setTypeid(String typeid) {

        this.typeid = typeid == null ? null : typeid.trim();

    }



    @Override

    public String toString() {

        return "Roommanage{" +

                "roomid=" + roomid +

                ", roomnum='" + roomnum + '\'' +

                ", roomfloor=" + roomfloor +

                ", roomimg='" + roomimg + '\'' +

                ", roomdesc='" + roomdesc + '\'' +

                ", roomprice=" + roomprice +

                ", roomstate='" + roomstate + '\'' +

                ", typeid='" + typeid + '\'' +

                '}';

    }

}