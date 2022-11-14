package com.cg.corejava;

public class StringHandling {

	public static void main(String[] args) {
		String s= new String("Avantika");
		s.concat("Bisht");//String objects are immutable----cannot be changed
		System.out.print(s);
		
		System.out.print(" \n");
		
		StringBuffer b=new StringBuffer("Avantika");
		b.append("Bisht");//StringBuffer objects are mutable in nature
		System.out.print(b);
		
		System.out.print(" \n");
		
		String a="Avi";
		System.out.print(a);
		
		System.out.print(" \n");
		
	    String s1=new String("hello");
	    String s2=new String("hello");
	    String s3="hello";
	    String s4="hello";
	    System.out.print(s1);
	    System.out.print(" \n");
	    System.out.print(s2);
	    System.out.print(" \n");
	    System.out.print(s3);
	    System.out.print(" \n");
	    System.out.print(s4);
	    
	    System.out.print(" \n");
	    
	    String x="Avantika";
	    System.out.print(x.toLowerCase());
	    System.out.print(" \n");
	    System.out.print(x.toUpperCase());
	    System.out.print(" \n");
	    System.out.print(x.length());
	    System.out.print(" \n");
	    System.out.print(x.equals("Avantika"));
	    System.out.print(" \n");
	    System.out.print(x.equals("avantika"));
	    System.out.print(" \n");
	    System.out.print(x.equalsIgnoreCase("AVANTIKA"));
	    System.out.print(" \n");
	    System.out.print(x.replace('A', 'P'));
	    System.out.print(" \n");
	    System.out.print(x.substring(4));
	    System.out.print(" \n");
	    System.out.print(x.substring(2));
	    System.out.print(" \n");
	    System.out.print(x.substring(2,6));
	    
	    System.out.print(" \n");
	    
	    String y="Ananya";
	    int z=10,c=20,d=30;
	    System.out.print(y+z+c+d);
	    System.out.print(" \n");
	    System.out.print(z+c+d+y);
	    System.out.print(" \n");
	    System.out.print(z+c+y+d);
	    System.out.print(" \n");
	    System.out.print(z+y+c+d);
	    
	    System.out.print(" \n");
	    
	    
	    
	}

}
