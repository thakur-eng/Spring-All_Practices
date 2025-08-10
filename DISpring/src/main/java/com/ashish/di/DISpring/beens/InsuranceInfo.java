package com.ashish.di.DISpring.beens;

public class InsuranceInfo {

	String totalCoverage;

	public String getTotalCoverage() {
		return totalCoverage;
	}

	public void setTotalCoverage(String totalCoverage) {
		this.totalCoverage = totalCoverage;
	}
	
	
	public void insuranceDetails() {
		System.out.println("totalCoverage " +totalCoverage);
	}
	
	
}

