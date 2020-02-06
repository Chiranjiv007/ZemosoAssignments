package com.zemoso.demo;

import org.springframework.stereotype.Component;

@Component
public interface Employee {

    public int getEid();
    public void setEid(int eid);

    public String getEname();
    public void setEname(String ename);

    public void showEmployeeDetails();
    public void doStuff();
}
