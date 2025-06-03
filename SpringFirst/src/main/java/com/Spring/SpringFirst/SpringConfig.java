package com.Spring.SpringFirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean("user")
	public User createUser() {
		User user = new User();
		user.setFirstName("Ashish");
		user.setLastName("Thakur");
		user.setEmail("ashish@gmail.com");

		return user;
	}

	@Bean("employeee")
	public Employee createEmployee() {
		Employee emp = new Employee();
		emp.setEmployeName("Ashish");
		emp.setEmployeSal(128900);

		return emp;

	}

}
