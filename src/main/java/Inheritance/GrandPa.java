package Inheritance;

/**
 *
 * @author Kallol Das Kushol
 */
public class GrandPa {
    int property_amount;

    GrandPa(){
        
    }
    GrandPa(int n){
        this.property_amount = n; // 100 set from Child class
    }
    

    void m2() {
        System.out.println("Inside m2 method of GrandPa");
    }
}
