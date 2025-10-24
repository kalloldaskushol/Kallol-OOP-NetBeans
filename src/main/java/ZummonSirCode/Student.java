/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZummonSirCode;

/**
 *
 * @author ASUS-PC
 */
public class Student {
    int id;//Instance variable
    String name;//String is class in Java
    float cgpa;
    public static String university="LU";//Property of class(when used public access modifier, it acts as global variable)
    

            
    
    
 
    static String getName(){//Property of instance
        //System.out.println(this.name); //this indicates reference of current object
        //System.out.println(this);
        return university;
    }
   public static void main(String[] args) { //that receives arguments of main method
       
        Student st1 = new Student();//here, st1 local variable and at the same time reference var
        Student st2 = new Student();
               
       int a=7;//local variable
       //System.out.println(name);//instance variable can't be accessed without creating object
       //System.out.println(st1.id);
       st1.name = "Xamil";
       
       //Student.st1.name = "Xaman";
       //System.out.println(st1.name);
       //System.out.println(st2.name);
       
       ///Student.st1
       
       //String s1 = st2.getName();
       //System.out.println(s1);//null
       
       //st1.university="Metro";//It's not the property of object
       System.out.println("you are from"+"  "+Student.university+a);
       Student.university = "Metro";
       System.out.println(Student.university);
       
       //println--> method
       //out ---> object
       //System ---> Class name
 
       
       System.out.println(Student.getName());//Here, getName is static

    }
}
