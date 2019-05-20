package com.czl.pojo.dto;

import java.io.Serializable;

public class EmployRole implements Serializable {

    private int employeeid;
    private String employeename;
    private String employeepass;
    private String employeetel;
    private String rolename;
    private String employeestate;

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeepass() {
        return employeepass;
    }

    public void setEmployeepass(String employeepass) {
        this.employeepass = employeepass;
    }

    public String getEmployeetel() {
        return employeetel;
    }

    public void setEmployeetel(String employeetel) {
        this.employeetel = employeetel;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getEmployeestate() {
        return employeestate;
    }

    public void setEmployeestate(String employeestate) {
        this.employeestate = employeestate;
    }

    @Override
    public String toString() {
        return "EmployRole{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeepass='" + employeepass + '\'' +
                ", employeetel='" + employeetel + '\'' +
                ", rolename='" + rolename + '\'' +
                ", employeestate='" + employeestate + '\'' +
                '}';
    }
}
