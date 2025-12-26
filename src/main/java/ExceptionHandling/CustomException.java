package ExceptionHandling;

/**
 *
 * @author Kallol Das Kushol
 */

public class CustomException extends Exception { // Here Exception is a building class of java.lang
    // if we extended RuntimeException then we could avoid the try-catch block in the main method. 
    
    CustomException(String msg){
       super(msg); // Now it will go to Exception class 's Perameterized Constructor
    }
    
    public static void main(String[] args){
        
        try{
        
        //System.out.println(7/0);
        throw new CustomException("Custom Exception"); // It's created by user. // Will be checked Exception.
        
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}