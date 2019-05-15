package com.czl.controller;

import com.czl.pojo.Roommanage;
import com.czl.pojo.RoommanageExample;
import com.czl.service.RoommanageService;
import com.czl.util.LayuiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoommanageController {

    @Resource
    private RoommanageService roommanageService;

    @RequestMapping("/selectByExample")
    @ResponseBody
    public LayuiUtil<Roommanage> selectByExample() {
        System.out.println(123);
        LayuiUtil<Roommanage> util = new LayuiUtil<>();
        RoommanageExample example = new RoommanageExample();
        List<Roommanage> list = roommanageService.selectByExample(example);

        util.setCode(0);
        util.setMsg("");
        util.setCount(list.size());
        util.setData(list);

        return util;
    }

    @RequestMapping("/updateRoomManage")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Roommanage message) {
        String roomstate = message.getRoomstate();
        String roomdesc = message.getRoomdesc();
        Integer roomid = message.getRoomid();
        Roommanage roommanage = roommanageService.selectByPrimaryKey(roomid);
        System.out.println(roommanage);
        roommanage.setRoomstate(roomstate);
        roommanage.setRoomdesc(roomdesc);
        roommanage.setRoomid(roomid);
        System.out.println(roommanage);
        return roommanageService.updateByPrimaryKeySelective(message);
    }
}
