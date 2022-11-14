package com.cg.corejava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		byte[][] x=new byte[2][3];//2D Array
		System.out.println(x);
		System.out.println(x[0][0]);
		System.out.println(x[0]);
		System.out.println(x[0][1]);
		
		System.out.println(" ");
		
		int[][][] y= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(y);
		System.out.println(y[0][1][2]);
		System.out.println(y[1][0][1]);
		System.out.println(y[1][1][1]);
		System.out.println(y[1][2][0]);
		System.out.println(y[2][1][0]);
		

	}

}
