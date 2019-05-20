package com.czl.mapper;

import com.czl.pojo.Hotelinfo;
import com.czl.pojo.HotelinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelinfoMapper {
    int countByExample(HotelinfoExample example);

    int deleteByExample(HotelinfoExample example);

    int deleteByPrimaryKey(Integer hotelid);

    int insert(Hotelinfo record);

    int insertSelective(Hotelinfo record);

    List<Hotelinfo> selectByExample(HotelinfoExample example);

    Hotelinfo selectByPrimaryKey(Integer hotelid);

    int updateByExampleSelective(@Param("record") Hotelinfo record, @Param("example") HotelinfoExample example);

    int updateByExample(@Param("record") Hotelinfo record, @Param("example") HotelinfoExample example);

    int updateByPrimaryKeySelective(Hotelinfo record);

    int updateByPrimaryKey(Hotelinfo record);

}