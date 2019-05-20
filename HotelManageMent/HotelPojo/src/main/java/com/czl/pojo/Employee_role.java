package com.czl.pojo;

import java.io.Serializable;

public class Employee_role implements Serializable {

    private int employee_roleid;
    private int employeeid;
    private int roleid;

    public int getEmployee_roleid() {
        return employee_roleid;
    }

    public void setEmployee_roleid(int employee_roleid) {
        this.employee_roleid = employee_roleid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "employee_role{" +
                "employee_roleid=" + employee_roleid +
                ", employeeid=" + employeeid +
                ", roleid=" + roleid +
                '}';
    }
}
