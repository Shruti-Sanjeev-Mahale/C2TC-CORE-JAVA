package com.cg.corejava;

public class StaticBlockDemo {

	public static void main(String[] args) {
		System.out.println("I am main");

	}
	
	static void m()
	{
		System.out.println("I am static method");
	}
	static
	{
		System.out.println("Good Morning");
		m();
	}

	static 
	{
		System.out.println("Good Evening");
	}


}
