package com.czl.controller;

import com.czl.pojo.Changeroom;
import com.czl.service.ChangeroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChangeroomController {
    @Autowired
    private ChangeroomService changeroomService;

    @RequestMapping("/getAllChangeroom")
    @ResponseBody
    public List<Changeroom> getAllChangeroom(){
        return changeroomService.getAllChangeroom();
    }
}
