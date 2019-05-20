package com.czl.service;

import com.czl.mapper.RoommanageMapper;
import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoommanageServiceImpl implements RoommanageService {
    @Autowired
    private RoommanageMapper roommanageMapper;

    @Override
    public List<Roommanage> selectByExample(RoommanageExample example) {
        return roommanageMapper.selectByExample(example);
    }
}
