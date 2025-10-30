package Inheritance;

/**
 *
 * @author Kallol Das Kushol
 */
public class Child extends Parent {
    Child(){
        
    }
    Child(int x){
        super(x); // Imidiate super class
    }
    int property_amount = 50;
    
    void m4 () {
        System.out.println("Inside m4 method of child");
    }
    void m3() {
        System.out.println("Entering to Child class");
    }
    public static void main(String[] args) {
        Child obj_Child = new Child(5000);
        System.out.println();
//        obj_Child.m4();
//        
//        // Build Parent class in Child class
        Parent obj_Parent = new Parent();
//        obj_Parent.m3();
//        
//        obj_Child.m3(); // First it will search if it is its own method or not. If it has the method then it will call it not the inharited one.
        
        GrandPa obj_GrandPa = new GrandPa();
//        obj_GrandPa.m2();
//        
//        obj_Child.m2(); // if it was in the parent class then it will print it. Not the Grandpa class one. Beacause its a hirerechial relation.
                
//        System.out.println(obj_GrandPa.property_amount); // 100 -> direct
//        System.out.println(obj_Parent.property_amount); // 100 -> By Grandpa
//        System.out.println(obj_Child.property_amount); // 50 -> direct
    
        // Assign Property Amount
        
        
    }
    
}
