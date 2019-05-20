package com.czl.service;

import com.czl.mapper.UserinfoMapper;
import com.czl.pojo.Userinfo;
import com.czl.pojo.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public Userinfo selectByPrimaryKey(Integer userid){
        return userinfoMapper.selectByPrimaryKey(userid);
    }

    @Override
    public Userinfo selectByPrimaryName(String username) {
        return userinfoMapper.selectByPrimaryName(username);
    }

    @Override
    public int insertSelective(Userinfo record) {
        return userinfoMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userinfoMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return userinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Userinfo> selectByExample(UserinfoExample example){
        return userinfoMapper.selectByExample(example);
    }

}
