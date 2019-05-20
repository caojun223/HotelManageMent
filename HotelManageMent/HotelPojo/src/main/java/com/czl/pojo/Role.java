package com.czl.pojo;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleid;

    private String rolename;

    private String rolestate;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolestate() {
        return rolestate;
    }

    public void setRolestate(String rolestate) {
        this.rolestate = rolestate == null ? null : rolestate.trim();
    }
}