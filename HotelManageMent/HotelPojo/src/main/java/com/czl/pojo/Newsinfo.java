package com.czl.pojo;

import java.io.Serializable;

public class Newsinfo implements Serializable {
    private Integer newsid;

    private String newtitle;

    private String newcontent;

    private static final long serialVersionUID = 1L;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle == null ? null : newtitle.trim();
    }

    public String getNewcontent() {
        return newcontent;
    }

    public void setNewcontent(String newcontent) {
        this.newcontent = newcontent == null ? null : newcontent.trim();
    }
}