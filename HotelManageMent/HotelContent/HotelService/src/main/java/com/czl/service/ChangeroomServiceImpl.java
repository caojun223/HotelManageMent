package com.czl.service;

import com.czl.mapper.ChangeroomMapper;
import com.czl.pojo.Changeroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChangeroomServiceImpl implements ChangeroomService{
    @Autowired
    private ChangeroomMapper changeroomMapper;
    @Override
    public List<Changeroom> getAllChangeroom() {
        return changeroomMapper.getAllChangeroom();
    }
}
