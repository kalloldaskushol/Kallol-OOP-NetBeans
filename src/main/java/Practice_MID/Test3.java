package Practice_MID;

class Car {
    String brand;
}

public class Test3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Tesla";
        c2.brand = "BMW";

        Car c3 = c2;
        c2 = c1;
        c1.brand = "Toyota";

        System.out.println(c1.brand);
        System.out.println(c2.brand);
        System.out.println(c3.brand);
    }
}
