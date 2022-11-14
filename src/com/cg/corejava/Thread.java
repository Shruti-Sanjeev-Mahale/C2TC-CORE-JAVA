package com.cg.corejava;

public class Thread {

	public static void main(String[] args) {
		Thread t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
	}

}
class Thread1 extends Thread
{
	public void run()
	{
		try {
			
		
		for(int i=0;i<5;i++);
		{
			Thread.sleep(2000);
			System.out.println("Square number " +(i*i));
		}
		}
		catch(InterruptException e)

	{
		e.printStackTrace();	}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
	
		for(int i=0;i<5;i++);
		{
			System.out.println("Double number " + (i*2));
		}
	}
}