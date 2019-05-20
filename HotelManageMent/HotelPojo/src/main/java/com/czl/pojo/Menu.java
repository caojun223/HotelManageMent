package com.czl.pojo;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private int mnid;
    private int menuid;
    private String menuname;
    private String parentid;
    private String menupath;
    private List<Menu> menuList;

    public int getMnid() {
        return mnid;
    }

    public void setMnid(int mnid) {
        this.mnid = mnid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getMenupath() {
        return menupath;
    }

    public void setMenupath(String menupath) {
        this.menupath = menupath;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mnid=" + mnid +
                ", menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", parentid='" + parentid + '\'' +
                ", menupath='" + menupath + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
