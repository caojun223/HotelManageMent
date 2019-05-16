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
    public int userDeleteKey(@RequestBody List userid1){
        System.out.println(userid1.size());
        if (userid1.size()>1){
            for (int i=0;i<userid1.size();i++){
                System.out.println(userid1.get(i));
                Integer userid=(Integer) userid1.get(i);
                return userInfoService.deleteByPrimaryKey(userid);
            }
            return -1;
        }else {
            return 1;
        }
    }


    @RequestMapping("userUpdateState")
    @ResponseBody
    public int userUpdateState(@RequestParam int userid){
        Userinfo userinfo= userInfoService.selectByPrimaryKey(userid);
        System.out.println(userinfo.getUserstate());
        System.out.println(userinfo.getUserstate()=="正常");
        if (userinfo.getUserstate().equals("正常")){
            userinfo.setUserstate("禁止");
            return userInfoService.updateByPrimaryKeySelective(userinfo);
        }else {
            userinfo.setUserstate("正常");
            return userInfoService.updateByPrimaryKeySelective(userinfo);
        }
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
}
