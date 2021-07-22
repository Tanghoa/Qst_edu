package com.recruit.entity;

public class Resume {
    private Integer id;

    private Integer uId;

    private String realName;

    private String sex;

    private Integer age;

    private String tel;

    private String education;

    private String job;

    private String email;

    private String forCity;

    private String forType;

    private String forSalary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getForCity() {
        return forCity;
    }

    public void setForCity(String forCity) {
        this.forCity = forCity == null ? null : forCity.trim();
    }

    public String getForType() {
        return forType;
    }

    public void setForType(String forType) {
        this.forType = forType == null ? null : forType.trim();
    }

    public String getForSalary() {
        return forSalary;
    }

    public void setForSalary(String forSalary) {
        this.forSalary = forSalary == null ? null : forSalary.trim();
    }
}