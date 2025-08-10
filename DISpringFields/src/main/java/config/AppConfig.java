package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Employee;

@Configuration

public class AppConfig {

	
	@Bean
	public Employee createEmployee() {
		Employee emp = new Employee("Ashish", "25" ,createAddress());
		return emp;
		
	}
	
	@Bean
	public Address createAddress() {
		
		Address add = new Address("BTM", "567069");
		return add;
		
	}
	
	
}
