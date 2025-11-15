package Practice_MID.WAP;

class Phone {
    int price = 15000;

    void Display() {
        System.out.println(" Just Phone. I have various types of Display.");
    }
    
}

class IPhone extends Phone {
    int price;

    IPhone() {
    }

    IPhone(int a) {
        this.price = a; //set it to 160000 (b)
    }

    void Display() {
        System.out.println("IPhone. I have Liquid Crystal Display.");
    }

    void dualVideoRecording() {
        System.out.println("IPhone. Have Dual Video Recording Feature.");
    }
}

class GalaxyS25 extends IPhone {
    void Display() {
        System.out.println("GalaxyS24. I have Dynamic AMOLED Display.");
    }
}

public class Test_62_Mid {
    static void displayAccess(Phone p) {
        p.Display();
    }
    
    
    public static void main(String[] args) {

        Phone phone = new IPhone();//upcasting
        phone.Display(); //call ip display

        System.out.println(phone.price); // call phone class price

        ((IPhone)phone).dualVideoRecording();

        displayAccess(new IPhone());
        displayAccess(new GalaxyS25());
    }
}
