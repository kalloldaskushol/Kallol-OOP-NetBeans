package ExceptionHandling;

/**
 *
 * @author Kallol Das Kushol
 */
public class TestException {
    double balance = 500; 
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Cash deducted");
        }else {
            try{
                throw new CustomException("Insufficient Balance!!!!");
            
            }catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) throws CustomException { // As im making my custom exception. 
//        have to add it other wise code will not run due to the checkedException is a runtime exception
        TestException TE = new TestException();
        TE.withdraw(50); // have to check
    }
}
