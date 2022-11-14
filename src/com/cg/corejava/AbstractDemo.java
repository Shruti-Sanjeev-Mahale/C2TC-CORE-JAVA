package com.cg.corejava;

public class AbstractDemo {

	public static void main(String[] args) {
		C objC=new D();
		objC.print();
	
		objC.method1();
		objC.method2();
		
	}

}

abstract class C{
	void print() {
		System.out.println("Non abstract method");
	}
	
	abstract void method1();
	abstract void method2();
	
}
class D extends C{
	
	void method1() {
		System.out.println("Abstract method defined in child class");
	}
	void method2() {
		System.out.println("This is also a abstract method ");
	}
}
