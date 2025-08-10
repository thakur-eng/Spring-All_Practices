package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {

	private String empAdd;

	public Address(String empAdd) {

		this.empAdd = empAdd;
	}

	 
	public String toString() {
		return "empAdd" + empAdd;

	}
}
