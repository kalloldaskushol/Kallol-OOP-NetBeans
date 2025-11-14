package Practice_MID;

class Laptop {
    String name;
}

public class Test5 {
    public static void main(String[] args) {
        Laptop x = new Laptop();
        Laptop y = new Laptop();
        Laptop z = x;

        x.name = "Dell";
        y.name = "HP";

        x = y;
        y.name = "MacBook";
        z.name = "Acer";

        System.out.println(x.name);
        System.out.println(y.name);
        System.out.println(z.name);
    }
}
