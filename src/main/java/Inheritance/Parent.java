package Inheritance;

/**
 *
 * @author Kallol Das Kushol
 */
public class Parent extends GrandPa {
    Parent(){
        this(100); // Calls its own Constructor
        this.property_amount = 500;// even if prop_amnt is not defined in the class, it will edit its parent class(Grandpa) prop_amnt; // In this case it will change the prop_amnt of the GrandPa.
    }
    Parent(int y){
        super(y);
        // super.m2(); // will call parent class m2 
        // super can bypass the call of its method, if it is defined in its own class.
    }
    void m3() {
        m2();// it will be called from parent class
        System.out.println("Inside m3 method of Parent");
    }
}
