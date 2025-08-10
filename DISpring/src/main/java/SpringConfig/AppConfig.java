package SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashish.di.DISpring.beens.Employee;
import com.ashish.di.DISpring.beens.InsuranceInfo;
import com.ashish.di.DISpring.beens.SalaryInfo;

@Configuration
public class AppConfig {

	@Bean 
	public Employee createEmployee() {
		Employee employee = new Employee();
		employee.setEmpName("Ashish");
		employee.setEmpemail("ashish@gmail.com");
		
		employee.setSalaryInfo(createSalaryInfo());
		
		employee.setInsuranceInfo(createsetInsuranceInfo());
		return employee;
		
	}
	 @Bean
		public   SalaryInfo createSalaryInfo() {
		 
		 SalaryInfo salryin =new SalaryInfo();
		 salryin.setBasesal("56000");
		 salryin.setTotalSal("130000");
			return null;
			
		}
	
	
	 @Bean
	 public InsuranceInfo  createsetInsuranceInfo() {
		 
		 InsuranceInfo insur = new InsuranceInfo();
		 insur.setTotalCoverage("100000");
		return null;
		 
	 }
	
	
}
