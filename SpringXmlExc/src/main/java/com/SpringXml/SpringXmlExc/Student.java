package com.SpringXml.SpringXmlExc;

public class Student {

	String name;
	String collage;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displayStudent()
	{
		System.out.println("Name" +name+"Collage"+collage+"Address"+address);
	}
	
}
