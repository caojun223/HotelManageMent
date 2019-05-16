package com.czl.mapper;

import com.czl.pojo.Paymentmanage;
import com.czl.pojo.PaymentmanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentmanageMapper {
    int countByExample(PaymentmanageExample example);

    int deleteByExample(PaymentmanageExample example);

    int deleteByPrimaryKey(Integer paymentid);

    int insert(Paymentmanage record);

    int insertSelective(Paymentmanage record);

    List<Paymentmanage> selectByExample(PaymentmanageExample example);

    Paymentmanage selectByPrimaryKey(Integer paymentid);

    int updateByExampleSelective(@Param("record") Paymentmanage record, @Param("example") PaymentmanageExample example);

    int updateByExample(@Param("record") Paymentmanage record, @Param("example") PaymentmanageExample example);

    int updateByPrimaryKeySelective(Paymentmanage record);

    int updateByPrimaryKey(Paymentmanage record);
}