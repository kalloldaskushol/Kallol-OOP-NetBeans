package Practice_MID;

class Book {
    String title;
}

public class Test1 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Java";
        b2.title = "Python";

        b2 = b1;
        b1.title = "C++";

        System.out.println(b2.title);
    }
}
