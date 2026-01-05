package Basic; // Folder Structure

/**
 *
 * @author Kallol Das Kushol
 */

public class Student {
    int id; // It is -> Instance(object) variable
    String name; // String is a class in JAVA
    float cgpa; // property of object
    
    static final double MAX_CGPA = 4.00; // "static final" keyword is used to declare a constant variable in JAVA.
    
    /*A variable declared inside a class and marked with the static keyword is called a class variable in Java.
        1. Class Variable → static variable (can change)

        2. Constant Variable → static final variable (cannot change)

        👉So -> All constants are class variables, but not all class variables are constants.
    */
    public static String university = "LU";// Global Variable due to public & static // property of class -> thats why takes only one space in memory not multiple for multiple obj.
    
    // Property of class (when used public access modifier, it acts as global variable)
    
    
    String getName(){ // property of instance(object)
            
            //System.out.println(name); 
            //System.out.println(this.name); //this indicates reference of current object
            return this.name;
    }
    
    public static void main(String[] args){
        Student std1 = new Student();
        //here, st1 is a local variable + reference variable
        
        Student std2 = new Student();
        
        //int a=7;//local variable
        
        System.out.println(std1.name); // capital start maximum time means its a class. 
        // System is a build in class. println is a method. 
        // Instance variable can't be accessed without creating object

        std1.name = "Kallol Das Kushol";
        std2.name = "Kushol";
        String s1 = std1.getName();
        System.out.println(s1);
        std2.getName();
        
        // class_name.university -> refers to the static call
        System.out.println(Student.university); // have to call by Student;
        Student.university = "MU";
        System.out.println(Student.university); // have to call by Student;
        
       // println--> method
       // out ---> object
       // System ---> Class name
        

    }
    
}
