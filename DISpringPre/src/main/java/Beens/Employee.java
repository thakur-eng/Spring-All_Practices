package Beens;

public class Employee {

	private String empName;
	private String empemail;
	private SalaryInfo salaryInfo;

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

	public void empDetail() {

		System.out.println("empName " + empName + " empemail " + empemail + " Basesalary " + salaryInfo.baseSal
				+ " Totalsalary " + salaryInfo.getTotalSal());
	}
}
