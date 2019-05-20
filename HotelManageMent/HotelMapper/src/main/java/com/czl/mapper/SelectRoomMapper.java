package com.czl.mapper;

import com.czl.dto.SelectRoom;

import java.util.List;

public interface SelectRoomMapper {

    List<SelectRoom> selectAllRoomByState(SelectRoom room);
}
