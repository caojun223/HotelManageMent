package com.czl.pojo;

import java.io.Serializable;

public class Hotelinfo implements Serializable {
    private Integer hotelid;

    private String hoteldesc;

    private String hoteladdress;

    private String hoteltel;

    private String hotelemail;

    private Integer newsid;

    private static final long serialVersionUID = 1L;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHoteldesc() {
        return hoteldesc;
    }

    public void setHoteldesc(String hoteldesc) {
        this.hoteldesc = hoteldesc == null ? null : hoteldesc.trim();
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress == null ? null : hoteladdress.trim();
    }

    public String getHoteltel() {
        return hoteltel;
    }

    public void setHoteltel(String hoteltel) {
        this.hoteltel = hoteltel == null ? null : hoteltel.trim();
    }

    public String getHotelemail() {
        return hotelemail;
    }

    public void setHotelemail(String hotelemail) {
        this.hotelemail = hotelemail == null ? null : hotelemail.trim();
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }
}