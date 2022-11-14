package com.cg.corejava;

public class MethodOverloading {

	public static void main(String[] args) 
	{
	    Poly obj= new Poly();
	    obj.m();
	    obj.m(45);
	    obj.m(5.0);
	    obj.m('A');
	    obj.m(161);
	    obj.m(5.6f);
	    
	}

}
class Poly
{
	public void m()
	{
		System.out.print("No Arguments");
		System.out.print(" \n");
	}
	public void m(int i)
	{
		System.out.print("Integer Arguments");
		System.out.print(" \n");
	}
	public void m(double d)
	{
		System.out.print("Double Arguments");
		System.out.print(" \n");
	}
}
