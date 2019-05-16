package com.czl.mapper;

import com.czl.pojo.Memberlevel;
import com.czl.pojo.MemberlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberlevelMapper {
    int countByExample(MemberlevelExample example);

    int deleteByExample(MemberlevelExample example);

    int deleteByPrimaryKey(Integer levelid);

    int insert(Memberlevel record);

    int insertSelective(Memberlevel record);

    List<Memberlevel> selectByExample(MemberlevelExample example);

    Memberlevel selectByPrimaryKey(Integer levelid);

    int updateByExampleSelective(@Param("record") Memberlevel record, @Param("example") MemberlevelExample example);

    int updateByExample(@Param("record") Memberlevel record, @Param("example") MemberlevelExample example);

    int updateByPrimaryKeySelective(Memberlevel record);

    int updateByPrimaryKey(Memberlevel record);
}