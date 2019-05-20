package com.czl.pojo.vo;

import java.util.List;

public class Role_menuVo {

    private Integer role_menuid;
    private Integer roleid;
    private List<Integer> menulist;

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

    public List<Integer> getMenulist() {
        return menulist;
    }

    public void setMenulist(List<Integer> menulist) {
        this.menulist = menulist;
    }

    @Override
    public String toString() {
        return "Role_menuVo{" +
                "role_menuid=" + role_menuid +
                ", roleid=" + roleid +
                ", menulist=" + menulist +
                '}';
    }
}
