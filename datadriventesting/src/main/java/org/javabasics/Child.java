package org.javabasics;

public class Child extends Parent{
	
	void method3(){
		System.out.println("Child class method 3");
	}

	void method4(){
		System.out.println("Child class method 4");
	}
	
	public static void main(String[] args){
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		Parent p2 = new Child(); //Parent can hold the child 
		
		
	}
	
}
