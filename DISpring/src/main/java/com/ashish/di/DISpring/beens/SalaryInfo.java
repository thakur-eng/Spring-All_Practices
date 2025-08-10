package com.ashish.di.DISpring.beens;

public class SalaryInfo {

	String basesal;
	String totalSal;
	
	public String getBasesal() {
		return basesal;
	}
	public void setBasesal(String basesal) {
		this.basesal = basesal;
	}
	public String getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(String totalSal) {
		this.totalSal = totalSal;
	}
	
	public void salryDetails() {
		
		
		System.out.println("basesal "+basesal+" totalSal "+totalSal);
	}
}
