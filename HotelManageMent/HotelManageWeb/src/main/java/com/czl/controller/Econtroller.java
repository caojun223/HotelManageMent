package com.czl.controller;

import java.util.List;

import com.czl.util.LayuiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czl.pojo.Employee;
import com.czl.service.Eservice;

@Controller
public class Econtroller {

	@Autowired(required = false)
	private Eservice eservice;

	@RequestMapping("getAllEmp")
	@ResponseBody
	public List<Employee> getAllEmp(){
		return eservice.getAllEmployee();
	}

	@RequestMapping("/getLayuiEmp")
	@ResponseBody
	public LayuiUtil<Employee> getLayuiEmp(){

		LayuiUtil<Employee> util=new LayuiUtil<>();
		util.setCode(0);
		util.setMsg("");
		List<Employee> allEmployee = eservice.getAllEmployee();
		util.setCount(allEmployee.size());
		util.setData(allEmployee);

		return util;
	}
	
	
}
