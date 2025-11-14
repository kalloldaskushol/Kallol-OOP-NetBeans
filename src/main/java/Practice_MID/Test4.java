package Practice_MID;

class Pen {
    String color;
}

public class Test4 {
    public static void main(String[] args) {
        Pen a = new Pen();
        Pen b = new Pen();
        Pen c = b;

        a.color = "Red";
        b.color = "Blue";

        b = a;
        c.color = "Black";

        System.out.println(a.color);
        System.out.println(b.color);
        System.out.println(c.color);
    }
}
