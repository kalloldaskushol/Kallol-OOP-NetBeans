package ExceptionHandling;


public class CustomException extends Exception {
    
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