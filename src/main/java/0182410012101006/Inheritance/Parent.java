//package Inheritance;

/*
	Author: Kallol Das Kushol
*/

public class Parent extends Grandpa {
	Parent() {
		//this(100);
		//this.property_amnt = 500;
	}
	Parent(int n) {
		super(n);
	}
	
	void m3() {
		m2();
		System.out.println("Inside m3 in parent");
	}
}