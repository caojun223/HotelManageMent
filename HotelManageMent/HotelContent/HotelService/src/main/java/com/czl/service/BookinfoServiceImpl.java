package com.czl.service;

import com.czl.mapper.BookinfoMapper;
import com.czl.pojo.Bookinfo;
import com.czl.pojo.BookinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookinfoServiceImpl implements BookinfoService{

    @Autowired
    private BookinfoMapper bookinfoMapper;
    @Override
    public List<Bookinfo> selectByExample(BookinfoExample example) {

        return bookinfoMapper.selectByExample(example);
    }
}
