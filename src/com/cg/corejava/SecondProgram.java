package com.cg.corejava;

import java.util.Scanner;

//Demo on taking input from the user
public class SecondProgram {

	public static void main(String[] args)
	{
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please enter first number-->");
		int num1=obj.nextInt();
		System.out.println("Please enter second numbers-->");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		System.out.println("Sum of two numbers-->"+ sum);
	}
	class ThirdProgram
	{
		
	}
	class FourthProgram
	{
		
	}
}
