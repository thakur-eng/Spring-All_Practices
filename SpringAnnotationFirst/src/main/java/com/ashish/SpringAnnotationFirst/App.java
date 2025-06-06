package com.ashish.SpringAnnotationFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import been.Student;
import config.Appconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Annotation Spring Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        
        Student student = (Student) context.getBean(Student.class);
        student.studentinfo();
    }
}
