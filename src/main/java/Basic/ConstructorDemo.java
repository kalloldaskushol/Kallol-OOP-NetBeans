package Basic;

/**
 *
 * @author Kallol Das Kushol
 */
// Constructor: Looks like a method but achually not a method.
// It must be similar to the class name.
// There is not return type
// Two types of constructor are available -> 
//    1. Parameterless Constructor (default Constructor)
//    2. Parameterized Constructor
// When there is no constructor, Implimenting default constructor is optional but when there is atleast one constructor, implimentinf default constructor is mendatory
// Constructor Syntex ---> Constructor_name/ Class_Name(parameters)
// ------------Have to understand-------------------
//Constructor Overloading:(Compile time Polymorphism)
//Decides(at compile time) which constructor will be 
//executed/accessed 
public class ConstructorDemo {

    String name;

    ConstructorDemo() { //default Constructor
        this("Shourav"); // will call the relavent constructor & This should be the first line of the constructor
        // this("Shourav", 8); // not possible
        
        System.out.println("Wellcome! The obj is created");
        // ConstructorDemo("Zamil"); ---> not possible
        // call another one
    }

    ConstructorDemo(String s) {
        this.name = s; // assigning the value
        System.out.println("Name is " + s);
    }
    ConstructorDemo(int a) {
        System.out.println("The value is " + a);
    }
    ConstructorDemo(double a) { // same type not available ---> if it was "int a" then it will be wrong.
        System.out.println("The value is " + a);
    }
    ConstructorDemo(String s, int a) {
        System.out.println("Name is " + s + " Value is  " + a);
    }
    ConstructorDemo(int a, String s) { // same name but position different, so its right.
        System.out.println("Name is " + s + " Value is  " + a);
    }
    

    public static void main(String[] args) {
        
        ConstructorDemo s1 = new ConstructorDemo();
        ConstructorDemo s2 = new ConstructorDemo("Kallol");
        ConstructorDemo s3 = new ConstructorDemo("Kushol");
        
        System.out.println("In main method: " + s3.name);
        
    }
}
