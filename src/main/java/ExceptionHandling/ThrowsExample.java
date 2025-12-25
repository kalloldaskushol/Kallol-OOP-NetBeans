package ExceptionHandling;

/**
 *
 * @author Kallol Das Kushol
 */


/*
Throws keyword:
    -Warns/ pretrends about probable exception  but doesn't directly handle exception
    -Writtten in method signature (in method and constructor signature but not directly in class signature)
    -Can write fpr both checked and uncheccked, but actually for checked exception

when trows checked exceptions must be catched, for unchecked exception they are optional
*/
import java.io.*;

public class ThrowsExample { // Throws can be also used in the constructor
    ThrowsExample() {}
    
    public static void readFile() throws ArithmeticException, FileNotFoundException {
        throw new ArithmeticException("Self Created ArithmeticException"); // User created
        // throw can be used in try-catch
//        System.out.println(7/0); // System Created 
    }
    
    public static void main(String[] args) { // Throws can be also used in the main, but not recomended
        try{
        readFile();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
//        catch(ArrayIndexOutOfBounds e)-> will not work cz its not in throws.
    }
    
}
