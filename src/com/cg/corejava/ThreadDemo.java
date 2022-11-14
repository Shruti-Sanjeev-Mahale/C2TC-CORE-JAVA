package com.cg.corejava;
import java.lang.Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread
{
	
	public void run()
	{
		
		for(int i = 0;i<5;i++);
		{
			
			
			System.out.println("Square number " + (i*i));
		}
	 }

	
}
class Thread2 extends Thread
{
	

	public void run()
	{
	
		
		
		for( int i=0;i<5;i++);
		{
			
			System.out.println("Double number " + (i*2));
		}
	}
}