package com.czl.service;

import com.czl.pojo.Bookinfo;
import com.czl.pojo.BookinfoExample;

import java.util.List;

public interface BookinfoService {
    List<Bookinfo> selectByExample(BookinfoExample example);
}
