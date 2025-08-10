package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String empName;

	@Autowired
	private Address address;

	public Employee(String empName) {

		this.empName = empName;

	}

	
	public String toString() {
		return "empName " + empName + " address " + address;

	}

}
