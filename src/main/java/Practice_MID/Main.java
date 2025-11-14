package Practice_MID;

class Hero {
    String msg;
    Hero(String m){ msg = m; }

    void change(Hero h){
        h.msg += " + Train";
        h = new Hero("New Hero");
        h.msg += " + Rise";
    }
}

public class Main {
    public static void main(String[] args) {
        Hero a = new Hero("Start");
        Hero b = a;
        a.change(b);
        System.out.println(a.msg);
        System.out.println(b.msg);
    }
}
