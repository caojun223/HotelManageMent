package com.czl.controller;

import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;
import com.czl.service.RoommanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoommanageController {
    @Autowired
    private RoommanageService roommanageService;
    @RequestMapping("RselectByExample")
    public List<Roommanage> selectByExample(RoommanageExample example){
        System.out.println("hello");
        return roommanageService.selectByExample(example);
    }
}
