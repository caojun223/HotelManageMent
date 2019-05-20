package com.czl.service;

import com.czl.dto.SelectRoom;
import com.czl.mapper.SelectRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectRoomServiceImpl implements SelectRoomService {

    @Autowired
    private SelectRoomMapper selectRoomMapper;

    @Override
    public List<SelectRoom> selectAllRoomByState(SelectRoom room) {
        return selectRoomMapper.selectAllRoomByState(room);
    }
}
