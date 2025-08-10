package beans;

public class Address {

	private String addLine1;
	private String addpincode;
	
	
	public Address(String addLine1, String addpincode)
	
	{
		 
		this.addLine1 = addLine1;
		this.addpincode = addpincode;
	}
	
	public String toString() {
		return "addLine1 "+ addLine1 + "addpincode "+addpincode;
		
	}
	
}
