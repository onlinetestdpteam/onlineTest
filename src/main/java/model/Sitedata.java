package model;

import java.util.Date;

public class Sitedata {
    private Integer id;

    private Integer viewcount;

    private Integer testcount;

    private Date time;

    private Integer registercount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getTestcount() {
        return testcount;
    }

    public void setTestcount(Integer testcount) {
        this.testcount = testcount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getRegistercount() {
        return registercount;
    }

    public void setRegistercount(Integer registercount) {
        this.registercount = registercount;
    }
}