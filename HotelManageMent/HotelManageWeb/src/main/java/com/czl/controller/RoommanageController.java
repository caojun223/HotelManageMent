package com.czl.controller;

import com.czl.dto.RoomAndType;
import com.czl.pojo.Roommanage;
import com.czl.service.RoomAndTypeService;
import com.czl.service.RoommanageService;
import com.czl.util.LayuiUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoommanageController {

    @Resource
    private RoommanageService roommanageService;

    @Resource
    private RoomAndTypeService roomAndTypeService;

    @RequestMapping("/selectAllRoomAndType")
    @ResponseBody
    public LayuiUtil<RoomAndType> selectAllRoomAndType() {
        System.out.println(123);
        LayuiUtil<RoomAndType> util = new LayuiUtil<>();
        List<RoomAndType> list = roomAndTypeService.selectAllRoomAndType();
        util.setCode(0);
        util.setMsg("");
        util.setCount(list.size());
        util.setData(list);
        return util;
    }

    @RequestMapping("/updateRoomManage")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Roommanage message) {
        String roomstate = message.getRoomstate();
        String roomdesc = message.getRoomdesc();
        Integer roomid = message.getRoomid();
        System.out.println(roomstate + "===" + roomdesc + "===" + roomid);
        if (roomstate.equals("取消预定"))
            roomstate = "空闲";
        message.setRoomstate(roomstate);
        message.setRoomdesc(roomdesc);
        message.setRoomid(roomid);
        System.out.println(message);
        return roommanageService.updateByPrimaryKeySelective(message);
    }
}
