package com.ashish.di.DISetter_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Employee;
import resources.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Employee employee = (Employee) context.getBean("createEmployee");

		employee.displayEmpDetails();
    }
}
