package com.czl.service;

import com.czl.mapper.HotelinfoMapper;
import com.czl.pojo.Hotelinfo;
import com.czl.pojo.HotelinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelinfoServiceImpl implements HotelinfoService {
    @Autowired
    private HotelinfoMapper hotelinfoMapper;

    @Override
    public List<Hotelinfo> selectByExample(HotelinfoExample example) {
        return hotelinfoMapper.selectByExample(example);
    }

   // @Override
   // public List<Hotelinfo> getAllHotelinfo(Hotelinfo hotelinfo) {
     //   return null;
    //}

    //@Override
    //public void saveHotelinfo(Hotelinfo hotelinfo) {

    //}

   // @Override
    //public void updateHotelinfo(Hotelinfo hotelinfo) {

    //}




}
