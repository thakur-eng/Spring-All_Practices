package com.ashish.jdbc.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbcConfig.SpringJdbcConfig;
 
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );
        
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

		JdbcTemplate template = (JdbcTemplate) context.getBean("createJdbcTemplate");

		String sql = "insert into attendence (id, student_name, date, status) values(?,?,?,?)";
		int count = template.update(sql, "12387", "Suraj Kumar", "2025-05-31", "Present");

		if (count > 0) {
			System.out.println("  Order created and inserted in Orders table.");
		} else {
			System.out.println(" Query has not Created");
		}
    }
}
