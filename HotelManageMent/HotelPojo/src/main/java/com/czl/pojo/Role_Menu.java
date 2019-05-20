package com.czl.pojo;

import java.io.Serializable;
import java.util.List;

public class Role_Menu implements Serializable {

    private Integer role_menuid;
    private Integer roleid;
    private Integer mnid;

    public Integer getRole_menuid() {
        return role_menuid;
    }

    public void setRole_menuid(Integer role_menuid) {
        this.role_menuid = role_menuid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMnid() {
        return mnid;
    }

    public void setMnid(Integer mnid) {
        this.mnid = mnid;
    }

    @Override
    public String toString() {
        return "Role_Menu{" +
                "role_menuid=" + role_menuid +
                ", roleid=" + roleid +
                ", mnid=" + mnid +
                '}';
    }
}
