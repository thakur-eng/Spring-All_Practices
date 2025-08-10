package com.ashish.di.DIConSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Employee;
import config.SpringConfig;

public class App {
	public static void main(String[] args) {
		System.out.println(" Constructor based spring Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee employee = (Employee) context.getBean("createEmp");

		System.out.println(employee);
	}
}
