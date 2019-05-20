package com.czl.service;

import com.czl.mapper.Emapper;
import com.czl.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EserviceImp implements Eservice{
	@Autowired
	private Emapper emapper;

	@Override
	public List<Employee> getAllEmployee() {
		
		return emapper.getAllEmployee();
	}

}
