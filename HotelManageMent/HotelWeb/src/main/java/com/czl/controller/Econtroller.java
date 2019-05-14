package com.czl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czl.pojo.Employee;
import com.czl.service.Eservice;

@Controller
public class Econtroller {
	@Autowired
	private Eservice eservice;
	@RequestMapping("getAllEmp")
	@ResponseBody
	public List<Employee> getAllEmp(){
		
		return eservice.getAllEmployee();
		
	}
	
	
}
