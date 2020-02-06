package com.zemoso.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootAutowiringApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootAutowiringApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Developer developer = context.getBean(Developer.class);
		developer.setEid(179);
		developer.setEname("Chiranjiv Goyal");
		developer.showEmployeeDetails();
		developer.doStuff();
	}

}
