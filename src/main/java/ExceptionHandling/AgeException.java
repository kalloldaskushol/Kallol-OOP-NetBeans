package ExceptionHandling;

/**
 *
 * @author KALLOL DAS KUSHOL
 */

import java.util.Scanner;
public class AgeException extends RuntimeException { // as it is created as a runtime exception, So we can avoid it handing on the complile time

    AgeException(String msg){
        super(msg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int age = sc.nextInt();
            if(age < 18 ){
                try{
                    throw new AgeException("can't vote");
                } catch (AgeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Vote success");
            }
        }
    }
}
