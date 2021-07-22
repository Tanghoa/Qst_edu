package com.recruit.entity;

public class Department {
    private Integer id;

    private Integer deptId;

    private String deptName;

    private String deptDes;

    private Integer cId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptDes() {
        return deptDes;
    }

    public void setDeptDes(String deptDes) {
        this.deptDes = deptDes == null ? null : deptDes.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}