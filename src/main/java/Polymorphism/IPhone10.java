package Polymorphism;

/**
 *
 * @author Kallol Das Kushol
 */
public class IPhone10 extends Phone {
    int price = 10;
    @Override
    void camera(){
        System.out.println("IPhone10, I have a dual camera.");
    }
    void special_ip17() {
        System.out.println("IPhone17 Special Features");
    }
}
