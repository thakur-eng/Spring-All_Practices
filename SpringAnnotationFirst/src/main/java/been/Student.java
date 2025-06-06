package been;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Ashish")
	private String firstName;
	@Value("Thakur")
	private String secondName;
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
	
	public void studentinfo()
	{
		System.out.println("firstName "+firstName+" secondName "+secondName);
	}
}
