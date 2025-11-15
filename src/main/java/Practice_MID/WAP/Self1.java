package Practice_MID.WAP;
/**
 * @author Kallol Das kushol
 */
class Product {
    String name;
    double price;
    //Constuctor:
    Product(){
        this.name = "Unknown";
        this.price = 0;
    }
    Product(String name){
        this.name = name;
    }
    Product(String name, int price){
        this.name = name;
        if(price > 0)this.price = price;
        else System.out.println("Invalid price");
    }
    double discountedPrice(int percent){
        return price - (price * (percent/100.0));
    }
    @Override
    public String toString() {
        return "Product name: " + name + " & Price : " + price;
    }     
}
public class Self1 {
    public static void main(String[] args) { // main function will be in main class
        Product p1 = new Product(); 
        Product p2 = new Product("abc"); 
        Product p3 = new Product("xyz", 100); 
        System.out.println(p1.discountedPrice(10));
        System.out.println(p2.discountedPrice(20));
        System.out.println(p3.discountedPrice(5));
    
    }
}
