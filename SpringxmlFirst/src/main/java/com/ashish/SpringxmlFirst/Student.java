package com.ashish.SpringxmlFirst;

public class Student {
	
	String studentName;
	String schoolName;
	int studentRoolNum;
	String studentFatherName;
	String studentFavSub;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStudentRoolNum() {
		return studentRoolNum;
	}
	public void setStudentRoolNum(int studentRoolNum) {
		this.studentRoolNum = studentRoolNum;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public String getStudentFavSub() {
		return studentFavSub;
	}
	public void setStudentFavSub(String studentFavSub) {
		this.studentFavSub = studentFavSub;
	}
	
	public void studentDetails() {
		
		System.out.println(" studentName "+studentName+" schoolName "+schoolName+" studentRoolNum "+studentRoolNum+" studentFatherName "+studentFatherName+" studentFavSub "+studentFavSub);
	}
	

}
