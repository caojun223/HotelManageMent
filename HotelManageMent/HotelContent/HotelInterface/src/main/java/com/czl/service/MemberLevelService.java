package com.czl.service;

import com.czl.pojo.Memberlevel;
import com.czl.pojo.MemberlevelExample;

import java.util.List;

public interface MemberLevelService {

    List<Memberlevel> selectByExample(MemberlevelExample example);

    Memberlevel selectByPrimaryKey(Integer levelid);

    int updateByPrimaryKeySelective(Memberlevel record);
}
