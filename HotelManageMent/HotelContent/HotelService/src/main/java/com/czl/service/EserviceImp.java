package com.czl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czl.mapper.Emapper;
import com.czl.pojo.Employee;
import com.czl.service.Eservice;
@Service
public class EserviceImp implements Eservice{
	@Autowired
	private Emapper emapper;

	@Override
	public List<Employee> getAllEmployee() {
		
		return emapper.getAllEmployee();
	}

}
