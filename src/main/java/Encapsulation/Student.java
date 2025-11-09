package Encapsulation;

//Encapsulation
//Access control mechanism
//Data Hiding
//Grouping/ Wraping up
//Can control role of users


/*
Encapsulation is a core concept in OOP,
that involves bundling data (attributes).
and the methods that operate on that data into a single unit,
Like a class.

This practice res
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
    
    
    
    // Geter-Seter
    public String getAddress(){
        return this.address;
    }
    
//    void setAddress(String s){
//        this.address = s;
//    }
    public void setAddress(String s, String u_name, String pass){
         if(this.username == u_name && this.password == pass){ 
        this.address = s;
        System.out.println("Address has been changed succesfully.");
       }
         else{
             System.out.println("Something went wrong!");
         }
    }
    
    public void ChangePassword(String old_p, String new_p, String user_n){
        if(this.password == old_p && this.username == user_n){ 
            this.password = new_p;
            System.out.println("Password has been changed succesfully.");
        }else{
            System.out.println("Something went wrong!");
        }
    }
}