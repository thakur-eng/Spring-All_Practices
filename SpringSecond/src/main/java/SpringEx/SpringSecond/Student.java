package SpringEx.SpringSecond;

public class Student {
	
	String collage;
	String studentName;
	int studentAge;
	
	
	
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		collage = collage;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Collage Name " +collage +"Student Name "+studentName+"Student Age "+ studentAge);
	}
}
