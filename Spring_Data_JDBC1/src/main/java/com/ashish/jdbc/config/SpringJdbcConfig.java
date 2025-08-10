package com.ashish.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfig {

	@Bean
	public DriverManagerDataSource createDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/kodewala");
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
