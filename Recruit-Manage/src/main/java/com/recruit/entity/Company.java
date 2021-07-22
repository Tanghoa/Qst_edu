package com.recruit.entity;

public class Company {
    private Integer id;

    private Integer cId;

    private String cRealName;

    private String cName;

    private String cPass;

    private String des;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcRealName() {
        return cRealName;
    }

    public void setcRealName(String cRealName) {
        this.cRealName = cRealName == null ? null : cRealName.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPass() {
        return cPass;
    }

    public void setcPass(String cPass) {
        this.cPass = cPass == null ? null : cPass.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}