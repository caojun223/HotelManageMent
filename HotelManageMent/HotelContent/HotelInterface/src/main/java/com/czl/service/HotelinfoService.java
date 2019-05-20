package com.czl.service;

import com.czl.pojo.Hotelinfo;
import com.czl.pojo.HotelinfoExample;

import java.util.List;

public interface HotelinfoService {
     //public List<Hotelinfo> getAllHotelinfo(Hotelinfo hotelinfo);
     //public void saveHotelinfo(Hotelinfo hotelinfo);
     //public void updateHotelinfo(Hotelinfo hotelinfo);

     List<Hotelinfo> selectByExample(HotelinfoExample example);

}
