package com.czl.service;

import com.czl.dto.SelectRoom;

import java.util.List;

public interface SelectRoomService {

    List<SelectRoom> selectAllRoomByState(SelectRoom room);
}
