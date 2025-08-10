package beens;
 
public class Student {

	private String name;
	private String email;
	private String branch;
	private String collage;
	private Teacher teacher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void studentInfo() {

		System.out.println("name" + name +

				"email" + email + "branch" + branch + "collage" + collage + "Teacher Branch & Department"
				+ teacher.getBranchcode() + " " + teacher.getDepartment()

		);

	}

}
