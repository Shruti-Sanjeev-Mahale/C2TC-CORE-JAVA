package com.cg.corejava;

public class MultipleInheritance {

	public static void main(String[] args) 
	{
        C1 obj=new C1();
        obj.displayA1();
        obj.displayB1();
        
	}

}
interface A1
{
	void displayA();
	
}
interface B1
{
	void displayB();
	
}
class C1 implements A1,B1
{
	public void displayB1()
	{
		System.out.println("I am from B1 interface");
	}
	public void displayA1()
	{
		System.out.println("I am from A1 interface");
	}
	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		
	}
}
