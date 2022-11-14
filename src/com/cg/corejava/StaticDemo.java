package com.cg.corejava;

public class StaticDemo {//I f a method  is static there is no need of object to call the method
	String name;
	int roll;
	static String coll="ABC University";
	
	
	void display()
	{
		System.out.println(name+"  "+roll+"  "+coll);
	}
	static void modify()
	{
		coll="Cambridge University";
	}

	public StaticDemo(String name,int roll)
	{
		super();
		this.name=name;
		this.roll=roll;
		
	}
	public static void main(String[] args)
	{

       StaticDemo s1=new StaticDemo("Anika",1);
       StaticDemo s2=new StaticDemo("Kanika",2);
       StaticDemo s3=new StaticDemo("Vamika",3);
       modify();
       s1.display();
       s2.display();
       s3.display();
       
	}

}

