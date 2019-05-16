package com.czl.mapper;

import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoommanageMapper {
    int countByExample(RoommanageExample example);

    int deleteByExample(RoommanageExample example);

    int deleteByPrimaryKey(Integer roomid);

    int insert(Roommanage record);

    int insertSelective(Roommanage record);

    List<Roommanage> selectByExample(RoommanageExample example);

    Roommanage selectByPrimaryKey(Integer roomid);

    int updateByExampleSelective(@Param("record") Roommanage record, @Param("example") RoommanageExample example);

    int updateByExample(@Param("record") Roommanage record, @Param("example") RoommanageExample example);

    int updateByPrimaryKeySelective(Roommanage record);

    int updateByPrimaryKey(Roommanage record);
}