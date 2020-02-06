package com.zemoso.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee {
    private  int eid;
    private String ename;

    @Autowired
    private Company company;

    @Override
    public int getEid() {
        return this.eid;
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

    public Company getCompany(){
        return company;
    }

    @Autowired
    public void setCompany(Company company){
        this.company = company;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer details: ");
        System.out.println("EmployeeId: " + eid);
        System.out.println("Employee Name: "+ ename);
        company.setCompanyName("Zemoso Technologies");
        System.out.println("Company: " + company.getCompanyName());
    }

    @Override
    public void doStuff() {
        System.out.println("Application development in process...");
    }
}
