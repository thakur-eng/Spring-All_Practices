package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Employee;
import beans.Address;

@Configuration
public class AppConfig {

	@Bean
	public Employee createEmp()

	{
		Employee employee = new Employee("kodewala");

		return employee;
	}

	@Bean
	public Address createAddress() {
		Address address = new Address("BTM");
		return address;

	}
}
