package com.czl.pojo;

import java.io.Serializable;

public class Permissions implements Serializable {
    private Integer permissionsid;

    private String permissionsname;

    private String permissionsstate;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(Integer permissionsid) {
        this.permissionsid = permissionsid;
    }

    public String getPermissionsname() {
        return permissionsname;
    }

    public void setPermissionsname(String permissionsname) {
        this.permissionsname = permissionsname == null ? null : permissionsname.trim();
    }

    public String getPermissionsstate() {
        return permissionsstate;
    }

    public void setPermissionsstate(String permissionsstate) {
        this.permissionsstate = permissionsstate == null ? null : permissionsstate.trim();
    }
}