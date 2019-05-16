package com.czl.dto;

import java.io.Serializable;

public class RoomAndType implements Serializable {
    private Integer RoomId;

    private String RoomNum;

    private String RoomFloor;

    private String RoomImg;

    private String RoomDesc;

    private String RoomPrice;

    private String RoomState;

    private String TypeName;

    public Integer getRoomId() {
        return RoomId;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public String getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(String roomNum) {
        RoomNum = roomNum;
    }

    public String getRoomFloor() {
        return RoomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        RoomFloor = roomFloor;
    }

    public String getRoomImg() {
        return RoomImg;
    }

    public void setRoomImg(String roomImg) {
        RoomImg = roomImg;
    }

    public String getRoomDesc() {
        return RoomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        RoomDesc = roomDesc;
    }

    public String getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        RoomPrice = roomPrice;
    }

    public String getRoomState() {
        return RoomState;
    }

    public void setRoomState(String roomState) {
        RoomState = roomState;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    @Override
    public String toString() {
        return "RoomAndType{" +
                "RoomId=" + RoomId +
                ", RoomNum='" + RoomNum + '\'' +
                ", RoomFloor='" + RoomFloor + '\'' +
                ", RoomImg='" + RoomImg + '\'' +
                ", RoomDesc='" + RoomDesc + '\'' +
                ", RoomPrice='" + RoomPrice + '\'' +
                ", RoomState='" + RoomState + '\'' +
                ", TypeName='" + TypeName + '\'' +
                '}';
    }
}
