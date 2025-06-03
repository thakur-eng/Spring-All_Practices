package com.ashish.SpringxmlSecond;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String ConfigFile="com/ashish/SpringxmlSecond/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(ConfigFile);
        
        GokulnandaPg pg = (GokulnandaPg) context.getBean("mypg");
        pg.pgDetails();
        
    }
}
