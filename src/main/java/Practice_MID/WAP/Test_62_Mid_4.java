package Practice_MID.WAP;

class Alpha {
    private int x = initX(); //2
    protected int y = 1;

    private int initX() {
        System.out.println("Alpha: initX()");//1st line
        return 2;
    }

    Alpha() {
        System.out.println("Alpha()"); //2nd line
        x += y;// x = x+y => x = 3
    }

    void show() {
        System.out.println("Alpha.show → x = " + (x)); //3
    }
}

class Beta extends Alpha {
    private int x = initX(); // 4
    protected int y = 3;

    private int initX() {
        System.out.println("Beta: initX()"); //3rd line
        return 4;
    }

    Beta() {
        System.out.println("Beta()"); //4th line
        x += y; // x=x+y =>  7
    }

    @Override
    void show() {
        super.show();
        System.out.println("Beta.show → x + y = " + (x + y)); //10
    }
}

public class Test_62_Mid_4 {
    public static void main(String[] args) {
        Alpha obj = new Beta();
        obj.show();
    }
}
