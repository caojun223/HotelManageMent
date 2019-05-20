package com.czl.mapper;

import com.czl.pojo.Consumeinfo;
import com.czl.pojo.ConsumeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumeinfoMapper {
    int countByExample(ConsumeinfoExample example);

    int deleteByExample(ConsumeinfoExample example);

    int insert(Consumeinfo record);

    int insertSelective(Consumeinfo record);

    List<Consumeinfo> selectByExample(ConsumeinfoExample example);

    int updateByExampleSelective(@Param("record") Consumeinfo record, @Param("example") ConsumeinfoExample example);

    int updateByExample(@Param("record") Consumeinfo record, @Param("example") ConsumeinfoExample example);
}