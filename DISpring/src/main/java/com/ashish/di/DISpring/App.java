package com.ashish.di.DISpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.ashish.di.DISpring.beens.Employee;

import SpringConfig.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	 
    public static void main( String[] args )
    {
        System.out.println( "DI Hello World!" );
        ApplicationContext context =new  AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp = (Employee) context.getBean(Employee.class);
        emp.employeeDetails();
     
        
    }

	 
}
