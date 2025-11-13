package DeepDiveIntoPolymorphism;

public class Student extends Human{
      
    int a;
    
   Student(){
       super();
       this.a=7;
       show();
       //super();
       //System.out.println("Inside Student Constructor.");
   }
           
   @Override
     void show(){
         System.out.println(a);
        //System.out.println("Show method of Student.");
    } 

}