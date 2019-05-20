package com.czl.controller;

import com.czl.pojo.Memberlevel;
import com.czl.pojo.MemberlevelExample;
import com.czl.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberLevelController {

    @Autowired(required = false)
    MemberLevelService memberLevelService;

    @RequestMapping("memberlevelSelectByExample")
    @ResponseBody
    public List<Memberlevel> selectByExample(){
        return memberLevelService.selectByExample(null);
    }

    @RequestMapping("memberlevelSelectByPrimaryKey")
    @ResponseBody
    public Memberlevel selectByPrimaryKey(Integer levelid){
        return memberLevelService.selectByPrimaryKey(levelid);
    }

    @RequestMapping("memberlevelUpdateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Memberlevel record) {
        return memberLevelService.updateByPrimaryKeySelective(record);
    }
}
