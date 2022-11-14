package com.cg.corejava;

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
		System.out.println("Calling for child class F"); 
		F f = new F();
		f.DisplayE();
		f.DisplayF();
		System.out.println("Calling for child class G"); 
		G g = new G(); 
		g.DisplayE(); 
		g.DisplayG(); 
		
		
	}

}
class E { 
	void DisplayE() { 
		System.out.println("This is a content of parent class"); 
	} 
} 
 
class F extends E { 
	void DisplayF() { 
		System.out.println("This is a content of child class 1"); 
	} 
} 
 
class G extends E { 
	void DisplayG() { 
		System.out.println("This is a content of child class 2"); 
	} 
} 