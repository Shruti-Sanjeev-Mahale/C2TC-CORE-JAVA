package com.cg.corejava;

public class SingleInheritance {

	public static void main(String[] args) 
	{
        	B obj=new B();
        	obj.a=10;
        	obj.b=20;
        	obj.c=30;
        	obj.show();
        	obj.display();
        	

	}

}
class A
{
	int a,b;
	void show()
	{
		System.out.print("I am coming from Parent class"+a+b);
	}
}
class B extends A
{
	int c;
	void display()
	{
		System.out.print(" \n");

		System.out.print("I am coming from Child class"+a+b+c);
	}
}