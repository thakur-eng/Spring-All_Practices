package com.ashish.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Employee;
import config.AppConfig;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp = (Employee) context.getBean("createEmployee");
        System.out.println(emp);
        
    }
}
