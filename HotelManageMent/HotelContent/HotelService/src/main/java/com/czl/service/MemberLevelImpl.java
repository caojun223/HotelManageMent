package com.czl.service;

import com.czl.mapper.MemberlevelMapper;
import com.czl.pojo.Memberlevel;
import com.czl.pojo.MemberlevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberLevelImpl implements MemberLevelService {

    @Autowired
    MemberlevelMapper memberlevelMapper;

    @Override
    public List<Memberlevel> selectByExample(MemberlevelExample example) {
        return memberlevelMapper.selectByExample(example);
    }

    @Override
    public Memberlevel selectByPrimaryKey(Integer levelid) {
        return memberlevelMapper.selectByPrimaryKey(levelid);
    }

    @Override
    public int updateByPrimaryKeySelective(Memberlevel record) {
        return memberlevelMapper.updateByPrimaryKeySelective(record);
    }
}
