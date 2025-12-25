
package ExceptionHandling;

/**
 *
 * @author Kallol Das Kushol
 */

// Exception -> Disruption or interaption in normal flow of program
// Exception Handling -> Disruption or interaption controling in normal flow of program
// Error -> resource related issue, can't be handled
// Types of Exception: 
//      1. Checked Exception, -> Complile time Exception
//              Suppose file exists, if should not throw any Exception but as it is checked Exception it must be handled whether Exception happened or not

//      2. UnChecked Exception -> Runtime Exception [ String s = null -> NullPointer Exception] 
//            - Not checked in compile time
//            - Subclasses of Runtime Exception
//            - Usually caused by programming language error
//              **Types of UnChecked Exception.


public class BasicException {
    
    void test_not_called(){
//        deww // The block will not run until its called
    }
    
    public static void main(String[] args){

//        try{
//            //Vulnerable line
//        }catch (Exception_class_ e) {
//            
//        }
        
        System.out.println("Hello");
//        System.out.println( 10/5 );
        try{
        System.out.println( 10/0 ); // This is an exception // will stop here
            System.out.println("This line will not work; cz it will leave when it founds the error line.");
        } catch(ArithmeticException e){
            System.out.println("Armetic Exception Handled <3 ");
            
        }
        System.out.println("Bye");
    }
}
