package com.ashish.jdbc.Spring_Data_JDBC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ashish.jdbc.config.SpringJdbcConfig;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        
        JdbcTemplate template = (JdbcTemplate) context.getBean("createJdbcTemplate");
        
        String sql = "insert into attendence ( id, student_name, date, status) value(?,?,?,?)";
        int count = template.update(sql ,"121","pankaj","2025-3-20","Absent");
        
        
        if(count>0) {
        	System.out.println("Order created and inserted in Orders table.");
        }else {
			System.out.println(" Query has not Created");

        }
        
    }
}
