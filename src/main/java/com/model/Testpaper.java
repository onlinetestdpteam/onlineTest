package com.model;

import java.util.Date;

public class Testpaper {
    private String id;

    private String papername;

    private String topictlist;

    private Date totaltime;

    private Integer subject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public String getTopictlist() {
        return topictlist;
    }

    public void setTopictlist(String topictlist) {
        this.topictlist = topictlist == null ? null : topictlist.trim();
    }

    public Date getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Date totaltime) {
        this.totaltime = totaltime;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }
}