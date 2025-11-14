class Box {
    int data;
    Box(int d) { data = d; }

    void update(Box b) {
        b.data += 5;
        b = new Box(20);
        b.data += 10;
    }
}

public class Test {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = b1;
        b2.update(b1);
        System.out.println(b1.data);
        System.out.println(b2.data);
    }
}
