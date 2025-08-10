package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String empName;
	private String empage;
	
	@Autowired
	private Address address;

	public Employee(String empName, String empage, Address address) {
		super();
		this.empName = empName;
		this.empage = empage;
		
	}

	@Override
	public String toString() {
		return "empName " +empName+ " empage "+empage + ", address: [" + address.toString() + "]";
		
	}
}
