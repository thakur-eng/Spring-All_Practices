package com.ashish.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashish.been.Employee;
import config.AppConfig;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Annation Spring  ");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = (Employee) context.getBean(Employee.class);

		emp.showInfo();
	}
}