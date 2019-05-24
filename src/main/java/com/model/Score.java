package com.model;

public class Score {
    private String id;

    private String stuid;

    private String subject;

    private Integer testscore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getTestscore() {
        return testscore;
    }

    public void setTestscore(Integer testscore) {
        this.testscore = testscore;
    }
}