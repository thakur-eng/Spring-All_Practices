package com.ashish.Springxml;

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
        System.out.println("Spring xml Hello World!" );
        
        String configFile = "com/ashish/Springxml/ApplicationContext.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
    
        User user = (User) context.getBean("myuser");
        user.displyUser();
    
    }
}
