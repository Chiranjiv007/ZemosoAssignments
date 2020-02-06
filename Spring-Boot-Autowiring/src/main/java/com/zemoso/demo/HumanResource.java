package com.zemoso.demo;

import org.springframework.stereotype.Component;

@Component
public class HumanResource implements Employee{
    private int eid;
    private String ename;
    private Company company;

    @Override
    public int getEid() {
        return eid;
    }

    @Override
    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String getEname() {
        return ename;
    }

    @Override
    public void setEname(String ename) {
        this.ename = ename;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public void showEmployeeDetails() {
    }

    @Override
    public void doStuff() {
        System.out.println("Need to hire some developers..");
    }
}
