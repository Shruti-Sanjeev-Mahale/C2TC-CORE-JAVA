package com.cg.corejava;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Please enter first number-->");
		int num1=obj.nextInt();
		System.out.println("Please enter second numbers-->");
		int num2=obj.nextInt();
		
		int subtract=num1-num2;
		System.out.println("Subtraction of two numbers-->"+ subtract);
		
		int multiply=num1-num2;
		System.out.println("Multiplication of two numbers-->"+ multiply);
		
		int divide=num1/num2;
		System.out.println("Division of two numbers-->"+ divide);
		
		int modulus=num1%num2;
		System.out.println("Modulus of two numbers-->"+ modulus);
	}

}
