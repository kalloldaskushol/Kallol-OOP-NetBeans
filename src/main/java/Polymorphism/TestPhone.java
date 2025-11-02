package Polymorphism;

/**
 *
 * @author Kallol Das Kushol
 */

/*
    Polymorphism
~ Has came from Poly(various/lots of) + morph(form)
~ Two types: 
    1. Compile Time Polymorphism (Method/ Constructor overloading)
    2. Run Time Polymorphism (Overriding)

Characteristics:
    1. Method signature (return type + name + parameters) must be same.
    2. Parameter must be same.
    3. Codes/Snippets are reuseable.
    4. Build Relationship.
*/

public class TestPhone {
    public static void main(String[] args) {
        // IPhone17 ip17 = new IPhone17();
        // ip17.camera();
        IPhone10 ip17 = new IPhone17(); // Up-Casting
        ip17.camera(); // it will have IPhone17 charterestics
        // if it was not defined in IPhone17 then it will be gone to IPhone10
        // ----> means Hirarcical
        
        // desides at runtime which method will be used, method overriding / Dynamic method dispatch.
        
//         ip17.special_ip17(); //Only possible if the method is overridden.
        
        // To use the prop which are only defined in the IPhone17 class it will have to be TypeCasted into IPhone17:
        ((IPhone17)ip17).special_ip17(); // down-casting //cz its originally IPhone10 it will now go to IPhone17
//        
//        Phone p = new Phone();
//        p.camera();
        // orelse not available;
    }
}
