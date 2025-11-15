package Practice_MID.WAP;

/**
 * @author Kallol Das Kushol
 */
class Gadget {
    private String brand;
    private String model;
    private double price;
   
    Gadget(){}
   
    Gadget(String b, String m, double p){
        this.brand = b;
        this.model = m;
        this.price = p;
    }
   
    public void display(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.price);
    }
   
//    Getter
    public double getPrice(){
        return this.price;
    }
}


// Child class 1
class SmartWatch extends Gadget {
    private boolean heartRate;
   
    SmartWatch(){}
    SmartWatch(String b, String m, double p, boolean heartRate){
        super(b, m, p);
        this.heartRate = heartRate;
    }
   
    void displaySmart(){
        display();
        System.out.println("heartRate: " + this.heartRate);
    }
}




// Child 2


class camera extends Gadget{
    private double megaPixel;
   
    camera(){}
    camera(String b, String m, double p, double mp){
        super(b, m, p);
        this.megaPixel = mp;
    }
    void displayCam(){
        display();
        System.out.println("Megapixel: " + this.megaPixel);
    }
}
public class Self3 {
   
    public static void main(String[] args) {
        SmartWatch s1 = new SmartWatch("Samsung", "A", 200, true);
       
        camera c1 = new camera("Nikon", "ISO", 100, 50);
       
    c1.displayCam();
        System.out.println("\n");
    s1.displaySmart();
    }
}
