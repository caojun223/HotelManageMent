package com.czl.controller;


import com.czl.pojo.Userinfo;
import com.czl.pojo.UserinfoExample;
import com.czl.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired(required = false)
    UserInfoService userInfoService;

    @RequestMapping("userSelectByPrimaryKey")
    @ResponseBody
    public Userinfo selectByPrimaryKey(@RequestParam Integer userid) {
        return userInfoService.selectByPrimaryKey(userid);
    }

    @RequestMapping("userSelectByExample")
    @ResponseBody
    public List<Userinfo> selectByExample() {
        return userInfoService.selectByExample(null);
    }

    @RequestMapping("userSelectByPrimaryName")
    @ResponseBody
    public Object selectByPrimaryName(@RequestBody Userinfo user) {
        String username = user.getUsername();
        System.out.println(username);
        Userinfo userinfo = userInfoService.selectByPrimaryName(username);
        System.out.println(userinfo);
        if (userinfo != null) {
            if (userinfo.getUsername().equals(user.getUsername())) {
                if (userinfo.getUserpass().equals(user.getUserpass())) {
                    if (userinfo.getUserstate().equals("禁止")) {
                        return -3;
                    } else {
                        return userinfo;
                    }
                } else {
                    return -2;
                }
            } else {
                return -1;
            }
        } else
            return -1;
    }

    @RequestMapping("userInsertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Userinfo record) {
        System.out.println(record);
        System.out.println(record.getUsername());
        System.out.println(record.getUserpass());
        System.out.println(record.getUseremail());
        Userinfo userinfo = userInfoService.selectByPrimaryName(record.getUsername());
        if (userinfo == null) {
            System.out.println(userInfoService.insertSelective(record));
            return 1;
        } else {
            return -1;
        }
    }

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Userinfo userinfo){
        String username = userinfo.getUsername();
        String userpass = userinfo.getUserpass();
        Userinfo userinfo1 = userInfoService.selectByPrimaryName(username);
        System.out.println(userinfo1.getUserid());
        userinfo1.setUserid(userinfo1.getUserid());
        userinfo1.setUserpass(userpass);
        return userInfoService.updateByPrimaryKeySelective(userinfo1);
    }

}
