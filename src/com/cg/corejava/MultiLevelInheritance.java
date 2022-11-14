package com.cg.corejava;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		 T obj = new T();
	      obj.display();
	      obj.show();
	      obj.view();	

	}

}
class S {
	   public void display() {
	      System.out.println("Inside display");
	   }
	}
	class R extends S {
	   public void show() {
	      System.out.println("Inside show");
	   }
	}
	class T extends R {
	   public void view() {
	      System.out.println("Inside view");
	   }
	}