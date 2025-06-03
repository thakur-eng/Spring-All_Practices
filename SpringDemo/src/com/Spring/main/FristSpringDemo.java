package com.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FristSpringDemo {

	public static void main(String[] args) {
    
		String  configration = "/com/Spring/main/Resorce/applicationContext.xml";
		
		ApplicationContext conts= new ClassPathXmlApplicationContext(configration);
		Students str = (Students)conts.getBean("myStu");
		System.out.println(str.getName());
		System.out.println(str.getAge());
		
		Students stre = (Students)conts.getBean("myStu1");
		System.out.println(str.getName());
		System.out.println(str.getAge());
	}

}
