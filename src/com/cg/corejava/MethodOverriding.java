package com.cg.corejava;

public class MethodOverriding {

	public static void main(String[] args)
	{
		

	}

}
class Parent
{
	void property()
	{
		System.out.println("Home/Plots/Cash/Jewellery");
		
	}
	void marry()
	{
		System.out.print("Shankutala");
	}
}
class Child extends Parent
{
	//MethodOverriding
	void marry()
	{
		System.out.print("Katrina Kaif");
	}
}
