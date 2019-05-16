package com.czl.service;

import com.czl.dto.RoomAndType;
import com.czl.mapper.RoomAndTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomAndTypeImpl implements RoomAndTypeService {

    @Autowired
    private RoomAndTypeMapper roomAndTypeMapper;

    @Override
    public List<RoomAndType> selectAllRoomAndType() {
        return roomAndTypeMapper.selectAllRoomAndType();
    }
}
