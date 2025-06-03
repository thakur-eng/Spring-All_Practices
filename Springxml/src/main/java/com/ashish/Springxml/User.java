package com.ashish.Springxml;

public class User {
	
	String name;
	String age;
	String add;
	String compny;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getCompny() {
		return compny;
	}
	public void setCompny(String compny) {
		this.compny = compny;
	}
	 
	public void displyUser()
	{
		System.out.println("name "+name+" age "+age+" add "+add+" compny "+compny);
	}
	

}
