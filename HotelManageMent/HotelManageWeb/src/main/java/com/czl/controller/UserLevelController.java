package com.czl.controller;

import com.czl.dto.UserLevel;
import com.czl.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserLevelController {

    @Autowired(required = false)
    UserLevelService userLevelService;

    @RequestMapping("UserLevelSelectAll")
    @ResponseBody
    public List<UserLevel> selectAllUserLevel() {
        return userLevelService.selectAllUserLevel();
    }
}
