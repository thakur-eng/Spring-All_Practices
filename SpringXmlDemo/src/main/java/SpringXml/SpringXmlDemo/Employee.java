package SpringXml.SpringXmlDemo;

public class Employee {
	
	String firstName;
	String secondName;
	String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void displayemp() {
		
		System.out.println("firstName"+firstName+"secondName"+secondName+"email"+email);
	}

}
