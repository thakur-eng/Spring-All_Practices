package com.ashish.SpringxmlFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " Spring XML Hello World!" );
        
        String ConfigFile = "com/ashish/SpringxmlFirst/ApplicationContext.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(ConfigFile);
         
        Student student = (Student) context.getBean("mystudent");
        student.studentDetails();
        
    }
}
