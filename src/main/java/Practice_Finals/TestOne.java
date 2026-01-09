class Employee {
	String name;
	double salary;
	
	Employee(){}
	Employee(String n, double s){
		this.name = n;
		this.salary = s;
	}
	
}

class Manager extends Employee {
	Manager(){}
	Manager(String n, double s){
		super(n, s);
	}
	double bonus (int hour){
		return this.salary + (hour * 1000);
	}
}

class Developer extends Employee {
	Developer(){}
	Developer(String n, double s){
		super(n, s);
	}
	
	double overTime(int hour){
		return this.salary + (hour * 9000);
	}
}

public class TestOne {
	public static void main (String[] args){
		
		Manager m1 = new Manager("Rahim", 50000);
		System.out.println("Manager name: " + m1.name + " Salary: " + m1.salary);
		System.out.println("Manager name: " + m1.name + " Salary after adding 12 hour bonus: " + m1.bonus(12));

		Developer dev1 = new Developer("Karim", 40000);
		System.out.println("Developer name: " + dev1.name + " Salary: " + dev1.salary);		
		System.out.println("Developer name: " + dev1.name + " Salary after adding 12 hour overTime: " + dev1.overTime(12));

	}
}