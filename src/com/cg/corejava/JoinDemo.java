package com.cg.corejava;

public class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		Y z=new Y();
		z.start();
		z.join(3000,50);
		for(int i=0;i<10;i++);
		{
			System.out.println("I am class R");
	
		}

	}

}
class Y extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am class Y");
			
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
