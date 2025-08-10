package Beens;

public class SalaryInfo {

	String baseSal;
	String totalSal;
	public String getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(String baseSal) {
		this.baseSal = baseSal;
	}
	public String getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(String totalSal) {
		this.totalSal = totalSal;
	}
	
	public void salInfo() {
		System.out.println("baseSal "+baseSal+" totalSal "+totalSal);
	}
}
