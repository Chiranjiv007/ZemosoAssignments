package com.zemoso.demo;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String name)
    {
        this.companyName = name;
    }

}
