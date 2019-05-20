package com.czl.service;

import com.czl.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployeeByName(String employeename);
}
