package com.cg.corejava;

public class HybridInheritance {

	public static void main(String[] args) 
	{
		K obj = new K();
		obj.dispK();
	}

}
class H
{
   public void dispH()
   {
	System.out.println("H");
   }
}

class I extends H
{
   public void dispI()
   {
	System.out.println("I");
   }
}

class J extends H
{
   public void dispJ()
   {
	System.out.println("J");
   }
	
}

class K extends I 
{
   public void dispK()
   {
	System.out.println("K");
   }
}