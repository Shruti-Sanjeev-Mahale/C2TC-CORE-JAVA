package com.cg.corejava;

import java.util.Scanner;

public class FourthProgram {

	public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Please enter first number-->");
		float num1=obj.nextFloat();
		System.out.println("Please enter second numbers-->");
		float num2=obj.nextFloat();
		
		float sum=num1+num2;
		System.out.println("Sum of two numbers-->"+ sum);
		
		float subtract=num1-num2;
		System.out.println("Subtraction of two numbers-->"+ subtract);
		
		float multiply=num1-num2;
		System.out.println("Multiplication of two numbers-->"+ multiply);
		
		float divide=num1/num2;
		System.out.println("Division of two numbers-->"+ divide);
		
		float modulus=num1%num2;
		System.out.println("Modulus of two numbers-->"+ modulus);

	}

}
