package com.czl.service;

import com.czl.pojo.Userinfo;
import com.czl.pojo.UserinfoExample;

import java.util.List;

public interface UserInfoService {

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer userid);

    Userinfo selectByPrimaryName(String username);

    int insertSelective(Userinfo record);

    int deleteByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Userinfo record);
}
