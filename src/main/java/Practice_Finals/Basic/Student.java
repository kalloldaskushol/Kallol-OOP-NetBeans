//package Basic;

/*
	Author: Kallol Das Kushol
*/

public class Student {
	// Instance Variable
	int id;
	String name;
	float cgpa;
	
	//Class Variable: A variable declared inside a class and marked with the static keyword is called a class variable in Java.
	static int Total_Student = 5000;
	
	
	//Global Variable: public & static
	public static String uni_name = "Leading University";
	
	
	// Making Constant 
	static final double MAX_CGPA = 4.00;
	
	//property of instance:
	String getName(){
		return this.name;
	}
	
	public static void main(String[] args){
		Student std1 = new Student();
		Student std2 = new Student();
		System.out.println(std1); // Will print memory address
		System.out.println(std1.name);
		
		std1.name = "Kallol Das Kushol";
		
		System.out.println(std1.name);
		System.out.println(std1.getName());
		
		System.out.println(std1.uni_name);
		System.out.println(Student.uni_name);
	}
	
}