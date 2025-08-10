package com.kodewala.webapp.aadhar.registration.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class JdbcConfig {
	@Bean
	public DriverManagerDataSource createDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_mvc_demo");
		ds.setUsername("root");
		ds.setPassword("Ashish@123");
		return ds;
	} 
	
	@Bean
	public JdbcTemplate createJdbcTemplate() {
		JdbcTemplate tampleat = new JdbcTemplate();
		tampleat.setDataSource(createDataSource());
		return tampleat;
		
	}
}