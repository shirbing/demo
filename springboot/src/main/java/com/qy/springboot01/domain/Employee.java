package com.qy.springboot01.domain;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empno;
    private String firstname;
    private String midinit;
    private String lastname;
    private Integer workdept;
    private String phoneno;
    private String hiredate;
    private String job;
    private Integer edlevel;
    private String sex;
    private String birthdate;
    private Double salary;
    private Double bonus;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidinit() {
        return midinit;
    }

    public void setMidinit(String midinit) {
        this.midinit = midinit;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getWorkdept() {
        return workdept;
    }

    public void setWorkdept(Integer workdept) {
        this.workdept = workdept;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getEdlevel() {
        return edlevel;
    }

    public void setEdlevel(Integer edlevel) {
        this.edlevel = edlevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
