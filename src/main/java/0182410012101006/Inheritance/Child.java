//package Inhertance;

/*
	Author: Kallol Das Kushol
*/

public class Child extends Parent {
	Child() {}
	Child(int n){
		//super(n);
	}
	
	void m4() {
		System.out.println("Inside m4 in Child");
	}
	
//	void m3() {
//		System.out.println("Inside m3 in Child");
//	}
	
	public static void main (String[] args){
		Child obj_child = new Child(10000);
		obj_child.m3();
		System.out.println(obj_child.property_amnt);
	}
}