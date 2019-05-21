package com.czl.controller;

import com.czl.pojo.Employee;
import com.czl.service.EmployeeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/HotelProject")
public class EmployeeController {
    @Autowired(required = false)
    private EmployeeService employeeService;
    @RequestMapping("getAllEmployees")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        List<Employee> list = employeeService.getAllEmployee();
        System.out.println(list);
        return list;
    }
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    @ResponseBody
    public Employee loginCheck(@RequestParam String employeename, @RequestParam String employeepass){

        System.out.println(employeename);
        Employee employee1 = employeeService.getEmployeeByName(employeename);

        System.out.println(employee1);
        return employee1;

        //创建Subject实例对象
       /* Subject subject = SecurityUtils.getSubject();*/
        //判断当前用户是否已登录
       /* if (subject.isAuthenticated() == false) {
            UsernamePasswordToken token = new UsernamePasswordToken(employeename, employeepass);
            try {
                subject.login(token);
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
                System.out.println("登录失败");
                return false;
            }
        }
        return true;*/
    }
}
