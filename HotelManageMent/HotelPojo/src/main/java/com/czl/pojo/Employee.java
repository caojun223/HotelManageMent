package com.czl.pojo;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer employeeid;

    private String employeename;

    private String employeepass;

    private String employeesex;

    private String employeetel;

    private String employeecarttype;

    private String employeecart;

    private String employeestate;

    private static final long serialVersionUID = 1L;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getEmployeepass() {
        return employeepass;
    }

    public void setEmployeepass(String employeepass) {
        this.employeepass = employeepass == null ? null : employeepass.trim();
    }

    public String getEmployeesex() {
        return employeesex;
    }

    public void setEmployeesex(String employeesex) {
        this.employeesex = employeesex == null ? null : employeesex.trim();
    }

    public String getEmployeetel() {
        return employeetel;
    }

    public void setEmployeetel(String employeetel) {
        this.employeetel = employeetel == null ? null : employeetel.trim();
    }

    public String getEmployeecarttype() {
        return employeecarttype;
    }

    public void setEmployeecarttype(String employeecarttype) {
        this.employeecarttype = employeecarttype == null ? null : employeecarttype.trim();
    }

    public String getEmployeecart() {
        return employeecart;
    }

    public void setEmployeecart(String employeecart) {
        this.employeecart = employeecart == null ? null : employeecart.trim();
    }

    public String getEmployeestate() {
        return employeestate;
    }

    public void setEmployeestate(String employeestate) {
        this.employeestate = employeestate == null ? null : employeestate.trim();
    }
}