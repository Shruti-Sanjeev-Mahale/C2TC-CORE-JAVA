package com.cg.corejava;

public class StudentConstructorDemo {
	String name;
	int rollNo;

	public StudentConstructorDemo(String name,int rollNo) {
		super();
		this.name=name;
		this.rollNo=rollNo;
	}

	public static void main(String[] args) {
		StudentConstructorDemo s1=new StudentConstructorDemo("Avantika",01);
		StudentConstructorDemo s2=new StudentConstructorDemo("Rupali",02);
		System.out.println(s1.name+" "+s1.rollNo);
		System.out.println(s2.name+" "+s2.rollNo);
		
	}

}
