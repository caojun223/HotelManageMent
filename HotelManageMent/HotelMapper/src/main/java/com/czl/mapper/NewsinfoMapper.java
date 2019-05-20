package com.czl.mapper;

import com.czl.pojo.Newsinfo;
import com.czl.pojo.NewsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsinfoMapper {
    int countByExample(NewsinfoExample example);

    int deleteByExample(NewsinfoExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(Newsinfo record);

    int insertSelective(Newsinfo record);

    List<Newsinfo> selectByExample(NewsinfoExample example);

    Newsinfo selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") Newsinfo record, @Param("example") NewsinfoExample example);

    int updateByExample(@Param("record") Newsinfo record, @Param("example") NewsinfoExample example);

    int updateByPrimaryKeySelective(Newsinfo record);

    int updateByPrimaryKey(Newsinfo record);
}