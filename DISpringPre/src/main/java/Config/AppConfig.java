package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Beens.Employee;
import Beens.SalaryInfo;

@Configuration
public class AppConfig {

	@Bean
	public Employee createEmployee() {
		Employee employee = new Employee ();
		employee.setEmpName("Ashish");
		employee.setEmpemail("ashish@gmail.com");
		
		employee.setSalaryInfo(createSalaryInfo());
		return employee;
	}
	
	@Bean
	public SalaryInfo createSalaryInfo() {
		SalaryInfo salaryInfo = new SalaryInfo();
		salaryInfo.setBaseSal("675685");
		salaryInfo.setTotalSal("100000");
 		return salaryInfo;
		
	}
	
}
