package com.ashish.di.DISpring.beens;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {

	String empName;
	String empemail;
	SalaryInfo salaryInfo;
	InsuranceInfo insuranceInfo;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public SalaryInfo getSalaryInfo() {
		return salaryInfo;
	}
	public void setSalaryInfo(SalaryInfo salaryInfo) {
		this.salaryInfo = salaryInfo;
	}
	public InsuranceInfo getInsuranceInfo() {
		return insuranceInfo;
	}
	public void setInsuranceInfo(InsuranceInfo insuranceInfo) {
		this.insuranceInfo = insuranceInfo;
	}
	
	public void employeeDetails() {
		
		System.out.println("empName "+empName+" empemai l"+empemail+"salaryInfo "+salaryInfo +" insuranceInfo "+insuranceInfo);
	}
}
