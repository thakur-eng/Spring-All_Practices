package beens;

public class Teacher {

	private String department;
	private String branchcode;
	private String spacilist;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}
	public String getSpacilist() {
		return spacilist;
	}
	public void setSpacilist(String spacilist) {
		this.spacilist = spacilist;
	}
	
	
	public void techaerInfo() {
		System.out.println("department"+department+"branchcode"+branchcode+"spacilist"+spacilist);
	}
}
