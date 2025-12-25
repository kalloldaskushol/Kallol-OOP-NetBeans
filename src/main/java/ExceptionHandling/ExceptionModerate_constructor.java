package ExceptionHandling;

public class ExceptionModerate_constructor {

    ExceptionModerate_constructor() {
        //try{
        //this(0);
        new ExceptionModerate_constructor(0);
        //}
        //catch(ArithmeticException e){

        // }
    }

    ExceptionModerate_constructor(int a) {
        System.out.println(7 / a);
    }

    public static void main(String[] args) {
        try {
            ExceptionModerate_constructor EM_cons = new ExceptionModerate_constructor();
        } catch (ArithmeticException e) {
            System.out.println("AE");
        }
    }
}
