package Inheritance;

/**
 *
 * @author Kallol Das Kushol
 */
public class Parent extends GrandPa {
    Parent(){
        this(100); // Calls its own Constructor
    }
    Parent(int y){
        super(y);
    }
    void m3() {
        System.out.println("Inside m3 method of Parent");
    }
}
