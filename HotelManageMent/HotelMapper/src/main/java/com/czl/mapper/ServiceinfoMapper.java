package com.czl.mapper;

import com.czl.pojo.Serviceinfo;
import com.czl.pojo.ServiceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceinfoMapper {
    int countByExample(ServiceinfoExample example);

    int deleteByExample(ServiceinfoExample example);

    int deleteByPrimaryKey(Integer serviceid);

    int insert(Serviceinfo record);

    int insertSelective(Serviceinfo record);

    List<Serviceinfo> selectByExample(ServiceinfoExample example);

    Serviceinfo selectByPrimaryKey(Integer serviceid);

    int updateByExampleSelective(@Param("record") Serviceinfo record, @Param("example") ServiceinfoExample example);

    int updateByExample(@Param("record") Serviceinfo record, @Param("example") ServiceinfoExample example);

    int updateByPrimaryKeySelective(Serviceinfo record);

    int updateByPrimaryKey(Serviceinfo record);
}