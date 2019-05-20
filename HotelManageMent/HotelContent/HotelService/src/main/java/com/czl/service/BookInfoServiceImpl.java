package com.czl.service;

import com.czl.mapper.BookinfoMapper;
import com.czl.pojo.Bookinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Resource
    private BookinfoMapper bookinfoMapper;

    @Override
    public int insertSelective(Bookinfo record) {
        return bookinfoMapper.insertSelective(record);
    }
}
