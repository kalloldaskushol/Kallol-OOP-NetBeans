package ExceptionHandling;

/**
 *
 * @author KALLOL DAS KUSHOL
 */
public class AgeException extends RuntimeException { // as it is created as a runtime exception, So we can avoid it handing on the complile time

    AgeException(String msg){
        super(msg);
    }
        public static void main(String[] args) {
            int age = 16;
            if(age < 18 ){
                throw new AgeException("can't vote"); 
            } else {
                System.out.println("Vote success");
            }
        }
}
