package com.czl.service;

import com.czl.mapper.RoomtypeMapper;
import com.czl.pojo.Roomtype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoomtypeServiceImpl implements RoomtypeService {

    @Resource
    private RoomtypeMapper roomtypeMapper;

    @Override
    public Roomtype selectByPrimaryKey(Integer typeid) {
        return roomtypeMapper.selectByPrimaryKey(typeid);
    }
}
