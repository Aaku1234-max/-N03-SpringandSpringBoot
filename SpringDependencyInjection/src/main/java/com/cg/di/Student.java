package com.cg.di;

public class Student {
	//variable
	private String StudentName;
	private int rollno;
	//dependency injection using constructor
	//constructor arg name should pass in beans.xml
	public Student(String studentName, int rollno) {
		super();
		StudentName = studentName;
		this.rollno = rollno;
	}

    /* //dependency using setters
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}*/
	//userdefined method
	public void display() {
		System.out.println("StudentName is: "+StudentName+" "+"and Roll no is: "+rollno);
	}
	

}
