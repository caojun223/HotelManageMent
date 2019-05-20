package com.czl.service;

import com.czl.mapper.EmployeeMapper;
import com.czl.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public Employee getEmployeeByName(String employeename) {
        return employeeMapper.getEmployeeByName(employeename);
    }
}
