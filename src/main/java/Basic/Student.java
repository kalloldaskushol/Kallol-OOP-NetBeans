package Basic; // Folder Structure

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS-PC
 */

public class Student {
    int id; // It is -> Instance(object) variable
    String name; // String is a class in JAVA
    float cgpa; // property of object
    
    public static String university = "LU";// Global Variable due to public & static // property of class -> thats why takes only one space in memory not multiple for multiple obj.
    
    // Property of class (when used public access modifier, it acts as global variable)
    
    
    
    String getName(){ // property of instance(object)
            
            //System.out.println(name); 
            //System.out.println(this.name); //this indicates reference of current object
            return this.name;
    }
    
    public static void main(String[] args){
        Student std1 = new Student(); //here, st1 local variable and at the same time reference var
        Student std2 = new Student();
        
        //int a=7;//local variable
        
        System.out.println(std1.name); // capital start maximum time means class. System is a build in class. println is a method. 
        //instance variable can't be accessed without creating object

        std1.name = "Kallol Das Kushol";
        std2.name = "Kushol";
        String s1 = std1.getName();
        System.out.println(s1);
        std2.getName();
        
        System.out.println(Student.university); // have to call by Student;
        Student.university = "MU";
        System.out.println(Student.university); // have to call by Student;
        
       // println--> method
       // out ---> object
       // System ---> Class name
        

    }
    
}
