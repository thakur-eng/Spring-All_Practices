package com.SpringXml.SpringXmlExc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String configFile =   "com/SpringXml/SpringXmlExc/ApplicationContext.xml";
      //  String configFile =  "SpringXml\\SpringXmlExc\\ApplicationContext.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        
        Student student = (Student) context.getBean("myStudent");
        student.displayStudent();
        
    }
}
