package com.czl.controller;

import com.czl.pojo.Roomtype;
import com.czl.service.RoomtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BookInfoController {

    @Resource
    private RoomtypeService roomtypeService;

    @RequestMapping("/selectRoomTypeByPrimaryKey")
    @ResponseBody
    public Roomtype selectByPrimaryKey(@RequestParam Integer typeid) {
        System.out.println(typeid);
        Roomtype roomtype = roomtypeService.selectByPrimaryKey(typeid);
        return roomtype;
    }
}
