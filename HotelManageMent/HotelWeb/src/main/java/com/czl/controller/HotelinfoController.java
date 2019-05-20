package com.czl.controller;

import com.czl.pojo.Hotelinfo;
import com.czl.pojo.HotelinfoExample;
import com.czl.service.HotelinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelinfoController {
    @Autowired
    private HotelinfoService hotelinfoService;
   // @RequestMapping("/getAllHotelinfo")
   // public List<Hotelinfo> getAllHotelinfo(Hotelinfo hotelinfo){
     //   System.out.println("ok");
       // return hotelinfoService.getAllHotelinfo(hotelinfo);
  //  }

    @RequestMapping("HSelectByExample")
    public List<Hotelinfo> selectByExample(HotelinfoExample example){
        System.out.println("成功");
        return hotelinfoService.selectByExample(example);
    }
}
