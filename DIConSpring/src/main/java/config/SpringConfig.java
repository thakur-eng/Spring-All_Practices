package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Employee;
import beans.SalaryInfo;

@Configuration
public class SpringConfig {

	@Bean
	public Employee createEmp() 
	
	{
		Employee employee=new Employee("Kodewala", createSalar());
		return employee;
		
		
	}
	@Bean
	public SalaryInfo createSalar()
	{
		SalaryInfo salaryInfo = new SalaryInfo(32436);
		 
		return salaryInfo;
		
	}
}
