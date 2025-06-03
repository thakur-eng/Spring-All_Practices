package SpringEx.SpringSecond;

public class Address {
	
	String studentAddress;
	String studentFather;
	String studentMother;
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentFather() {
		return studentFather;
	}
	public void setStudentFather(String studentFather) {
		this.studentFather = studentFather;
	}
	public String getStudentMother() {
		return studentMother;
	}
	public void setStudentMother(String studentMother) {
		this.studentMother = studentMother;
	}
	
	public void displayAddres()
	{
		System.out.println("Student Address "+studentAddress + "Student Father " +studentFather+"Student Mother "+studentMother);
	}

}
