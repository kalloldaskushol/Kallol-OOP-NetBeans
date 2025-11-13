package Encapsulation;

/**
 *
 * @author Kallol Das Kushol
 */

import java.util.*;

public class EncapsulationTest {
    
    public static void main(String[] args) {
        Student st1 = new Student("Xamil", 101, "Sylhet1", "xam", "pass123");
        
        Student st2 = new Student("Xara", 102, "Sylhet2", "xar", "pass456");
        
        //st2: 
        //System.out.println(st2.address); // will not work as it is private
//        System.out.println(st2.getAddress()); // Geting the private data
        
        //st2.setAddress("Syltet3", "xar", "pass123");
//        st2.setAddress("Syltet3", "xar", "pass456");
//        System.out.println(st2.getAddress());
//        st1.ChangePassword("pass123", "pass456", "xam");
        

        // H.W ----> WAP 3 attempts = You are locked for life-time;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            System.out.println("Enter Your Username");
            String u_name = sc.nextLine();
            
            System.out.println("Enter Your Password");
            String o_pass = sc.nextLine();
            
            System.out.println("Enter New Password");
            String n_pass = sc.nextLine();
            
            if(i == 3)  {
                System.out.println("\nYour Locked for lifetime\nTry in next life <3");
                break;
                
            }else st1.ChangePassword(o_pass, n_pass, u_name);
        }
    }
}