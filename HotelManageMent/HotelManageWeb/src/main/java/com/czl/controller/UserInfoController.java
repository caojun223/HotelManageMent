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
    public Userinfo selectByPrimaryKey(@RequestParam Integer userid){
        return userInfoService.selectByPrimaryKey(userid);
    }

    @RequestMapping("userSelectByExample")
    @ResponseBody
    public List<Userinfo> selectByExample(){
        return userInfoService.selectByExample(null);
    }

    @RequestMapping("userSelectByPrimaryName")
    @ResponseBody
    public Userinfo selectByPrimaryName(@RequestParam String username){
        return userInfoService.selectByPrimaryName(username);
    }

    @RequestMapping("userDeleteKey")
    @ResponseBody
    public int userDeleteKey(@RequestParam int userid){
        return userInfoService.deleteByPrimaryKey(userid);
    }


    @RequestMapping("userUpdateState")
    @ResponseBody
    public int userUpdateState(@RequestParam int userid){
        Userinfo userinfo= userInfoService.selectByPrimaryKey(userid);
        if (userinfo.getUserstate().equals("正常")){
            userinfo.setUserstate("禁止");
            return userInfoService.updateByPrimaryKeySelective(userinfo);
        }else {
            userinfo.setUserstate("正常");
            return userInfoService.updateByPrimaryKeySelective(userinfo);
        }
    }

    @RequestMapping("userUpdateState3")
    @ResponseBody
    public int userUpdateState3(@RequestParam String userid2){

        String[] userid1 = userid2.split(",");
        for (int i = 0; i < userid1.length; i++) {
            String useridString = userid1[i];
            Integer userid = Integer.parseInt(useridString);
             Userinfo userinfo= userInfoService.selectByPrimaryKey(userid);
        if (userinfo.getUserstate().equals("正常")){
            userinfo.setUserstate("禁止");
            userInfoService.updateByPrimaryKeySelective(userinfo);
        }else {
            userinfo.setUserstate("正常");
            userInfoService.updateByPrimaryKeySelective(userinfo);
        }
        }
        return 1;
    }

    @RequestMapping("userUpdatePassword")
    @ResponseBody
    public int userUpdatePassword(@RequestParam String password,@RequestParam String password2,@RequestParam int userid ){
        Userinfo userinfo = userInfoService.selectByPrimaryKey(userid);
        if (userinfo.getUserpass().equals(password2)){
            userinfo.setUserpass(password);
            userinfo.setUserid(userid);
            return userInfoService.updateByPrimaryKeySelective(userinfo);
        }else {
            return -1;
        }
    }

    @RequestMapping("userInsertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Userinfo record) {
        Userinfo userinfo = userInfoService.selectByPrimaryName(record.getUsername());
        if (userinfo == null) {
            return userInfoService.insertSelective(record);
        } else {
            return -1;
        }
    }

    @RequestMapping("FuzzySelectChance")
    @ResponseBody
    public List<Userinfo> FuzzySelectChance(@RequestParam String username){
        System.out.println(username);
        System.out.println(userInfoService.FuzzySelectChance(username));
        return userInfoService.FuzzySelectChance(username);
    }

}
