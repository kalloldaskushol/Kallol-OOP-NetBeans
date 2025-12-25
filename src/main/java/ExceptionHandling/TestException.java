/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author Kallol Das Kushol
 */
public class TestException {
    double balance = 500; 
    void withdraw(double amount) throws CustomException {
        if(amount <= balance){
            balance -= amount;
        }else {
            try{
                throw new CustomException("Insufficient Balance!!!!");
            
            }catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        TestException TE = new TestException();
//        TE.withdraw(5000); // have to check
    }
}
