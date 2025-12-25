package ExceptionHandling;

//#Propagation Through Methods
//#Task: Propagation Through Constructors

public class ExceptionModerate {
 
    void E3(){
        System.out.println(7/0);
        System.out.println("E3");
    }
    
     void E2(){
        System.out.println("E2");
        try{
        E3();
        }catch(ArithmeticException e){
            E3();
            System.out.println("Tragedy Handled");
        }
 
}   
    void E1(){
        E2();
        System.out.println("E1");
    }
    
    public static void main(String[] args) {
        
        ExceptionModerate EM = new ExceptionModerate();
        EM.E1();
     
    }
    
    
}