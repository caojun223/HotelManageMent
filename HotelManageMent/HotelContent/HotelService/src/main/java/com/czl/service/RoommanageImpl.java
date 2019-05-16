package com.czl.service;

import com.czl.mapper.RoommanageMapper;
import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoommanageImpl implements RoommanageService {

    @Autowired
    private RoommanageMapper roommanageMapper;

    @Override
    public int countByExample(RoommanageExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RoommanageExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer roomid) {
        return 0;
    }

    @Override
    public int insert(Roommanage record) {
        return 0;
    }

    @Override
    public int insertSelective(Roommanage record) {
        return 0;
    }

    @Override
    public List<Roommanage> selectByExample(RoommanageExample example) {
        return roommanageMapper.selectByExample(example);
    }

    @Override
    public Roommanage selectByPrimaryKey(Integer roomid) {
        return roommanageMapper.selectByPrimaryKey(roomid);
    }

    @Override
    public int updateByExampleSelective(Roommanage record, RoommanageExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Roommanage record, RoommanageExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Roommanage record) {
        return roommanageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Roommanage record) {
        return roommanageMapper.updateByPrimaryKey(record);
    }
}
