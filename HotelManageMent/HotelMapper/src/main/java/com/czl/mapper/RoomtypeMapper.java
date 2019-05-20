package com.czl.mapper;

import com.czl.pojo.Roomtype;
import com.czl.pojo.RoomtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomtypeMapper {
    int countByExample(RoomtypeExample example);

    int deleteByExample(RoomtypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Roomtype record);

    int insertSelective(Roomtype record);

    List<Roomtype> selectByExample(RoomtypeExample example);

    Roomtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Roomtype record, @Param("example") RoomtypeExample example);

    int updateByExample(@Param("record") Roomtype record, @Param("example") RoomtypeExample example);

    int updateByPrimaryKeySelective(Roomtype record);

    int updateByPrimaryKey(Roomtype record);
}