package com.cg.corejava;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[]arr= {89,67,98,45,0,12,67,890,1000};
		
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		 System.out.println("Length of the array is= "+arr.length);
		
	}
	  

}
