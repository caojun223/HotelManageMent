package com.czl.controller;


import com.czl.pojo.Bookinfo;
import com.czl.pojo.BookinfoExample;
import com.czl.service.BookinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BookinfoController {

    @Autowired
    private BookinfoService bookinfoService;

    @RequestMapping("BSelectByExample")
    public List<Bookinfo> selectByExample(BookinfoExample example){
        System.out.println("ok");
        return bookinfoService.selectByExample(example);
    }

}
