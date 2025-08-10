package com.ashish.di.DISpringPre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beens.Employee;
import Config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp = (Employee) context.getBean(Employee.class);
        emp.empDetail();
    }
}
