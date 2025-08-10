package com.ashish.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Employee;
import config.AppConfig;
import config.AppConfig;


public class App {
	public static void main(String[] args) {
		System.out.println("field type Spring ");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = (Employee) context.getBean("createEmp");

		System.out.println(employee);
	}
}
