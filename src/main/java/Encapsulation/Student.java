package Encapsulation;

//Encapsulation: Access Control mechanism
//Data Hiding
//Grouping/wraping Up
//Can control role of users


/*

//Encapsulation is a core concept in object-oriented 
//programming that involves bundling data (attributes) 
//and the methods (functions) that operate on that data 
//into a single unit, like a class. This practice restricts 
//direct access to an object's internal state, 
//protecting it from unintended modifications 
//and creating a "black box" that exposes only 
//what is necessary through a public interface

*/
/**
 *
 * @author Kallol Das Kushol
 */

public class Student {
    String name; // Access modifier = default
    int id;
    private String address;
    private String username;
    private String password;
    
    Student(String name, int id, String address, String username, String password){
        this.name = name;
        this.id = id;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    
    
    // Getter-Setter: used to access the private properties of a class. It will be public
    public String getAddress(){ // This is a Getter
        return this.address;
    }
    
//    void setAddress(String s){
//        this.address = s;
//    }
    
    public void setAddress(String s, String u_name, String pass){ // This is a Setter
        
        if(this.username == u_name && this.password == pass){ 
        this.address = s;
        System.out.println("Address has been changed succesfully.");
       }
         else{
             System.out.println("Something went wrong!");
         }
    }
    
    // Seter ---->
    public void ChangePassword(String old_p, String new_p, String user_n){
        
        if(this.password.equals(old_p) && this.username.equals(user_n)){ 
            this.password = new_p;
            System.out.println("Password has been changed succesfully.");
        }else{
            System.out.println("Something went wrong!\nTry Again....");
        }
    }
}