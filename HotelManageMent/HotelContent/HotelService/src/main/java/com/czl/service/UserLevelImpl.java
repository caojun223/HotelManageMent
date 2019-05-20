package com.czl.service;

import com.czl.dto.UserLevel;
import com.czl.mapper.UserLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLevelImpl implements UserLevelService{

    @Autowired
    UserLevelMapper userLevelMapper;


    @Override
    public List<UserLevel> selectAllUserLevel() {
        return userLevelMapper.selectAllUserLevel();
    }
}
