class Phone {
    String model;
}

public class Test2 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = p1;

        p1.model = "iPhone";
        p2.model = "Samsung";

        p1 = p2;
        p3.model = "Nokia";

        System.out.println(p1.model);
        System.out.println(p2.model);
        System.out.println(p3.model);
    }
}
