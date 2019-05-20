package com.czl.service;

import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;

import java.util.List;

public interface RoommanageService {
     List<Roommanage> selectByExample(RoommanageExample example);
}
