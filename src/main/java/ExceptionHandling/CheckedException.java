package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;// Have to import it bcz its not frequently used thats why its not in the java.lang;
import java.io.IOException;

/**
 *
 * @author Kallol Das Kushol
 */
public class CheckedException {

    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/main/java/ExceptionHandling/newfile.txt"); // Starts searching from src
         
            try {
                int ch = fs.read();// returns in integer format from byteStream or by reading byte Stream
                while(ch != -1){
                    //ch = fs.read();
                    System.out.print((char) ch);
                    ch = fs.read();
                }
            } catch (IOException e) {
                System.out.println("IO Exception Happened!!!!");
            }

        } catch (FileNotFoundException e) {
                System.out.println("File not Found.");
        }
        }
    }
