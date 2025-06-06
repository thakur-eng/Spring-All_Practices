package com.ashish.SpringAnnotationThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import been.Collage;
import config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(" Annotation based Spring " );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Collage collage = (Collage) context.getBean(Collage.class);
        collage.studentInfo();
    }
}
 