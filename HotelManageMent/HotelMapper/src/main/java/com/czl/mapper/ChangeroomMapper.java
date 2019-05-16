package com.czl.mapper;

import com.czl.pojo.Changeroom;
import com.czl.pojo.ChangeroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangeroomMapper {
    int countByExample(ChangeroomExample example);

    int deleteByExample(ChangeroomExample example);

    int deleteByPrimaryKey(Integer hangeid);

    int insert(Changeroom record);

    int insertSelective(Changeroom record);

    List<Changeroom> selectByExample(ChangeroomExample example);

    Changeroom selectByPrimaryKey(Integer hangeid);

    int updateByExampleSelective(@Param("record") Changeroom record, @Param("example") ChangeroomExample example);

    int updateByExample(@Param("record") Changeroom record, @Param("example") ChangeroomExample example);

    int updateByPrimaryKeySelective(Changeroom record);

    int updateByPrimaryKey(Changeroom record);
}