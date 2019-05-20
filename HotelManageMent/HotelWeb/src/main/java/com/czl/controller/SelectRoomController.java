package com.czl.controller;

import com.czl.dto.SelectRoom;
import com.czl.pojo.Roomtype;
import com.czl.service.SelectRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class SelectRoomController {

    @Resource
    private SelectRoomService selectRoomService;

    @RequestMapping("/selectAllRoomByState")
    @ResponseBody
    public List<SelectRoom> selectAllRoomByState(@RequestParam Long chickIn, Long chickOut) {
        Date date = new Date(chickIn);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date);
        Timestamp timestamp1 = Timestamp.valueOf(format);
        System.out.println(timestamp1);

        Date date1 = new Date(chickOut);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = dateFormat1.format(date1);
        Timestamp timestamp = Timestamp.valueOf(format1);
        System.out.println(timestamp);
        SelectRoom room = new SelectRoom();
        room.setChickin(timestamp1);
        room.setChickout(timestamp);
        return selectRoomService.selectAllRoomByState(room);
    }
}
