package com.ashish.di.DISpringPre1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beens.Student;
import config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " DI Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student stu = (Student) context.getBean(Student.class);
        stu.studentInfo();
        
         
    }
}
