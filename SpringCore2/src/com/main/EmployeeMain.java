package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
 
		String configFile = "/com/resource/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		
		Employee emp =(Employee) context.getBean("myemp");
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getEmail());
	}

}
