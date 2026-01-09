import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

abstract class Performer {

    abstract void perform();
	
}

class Singer extends Performer {

    @Override
    void perform() {
        System.out.println("Singer is performing");
    }
}

class Dancer extends Performer {

    @Override
    void perform() {
        System.out.println("Dancer is performing");
    }
}

class Magician extends Performer {

    @Override
    void perform() {
        System.out.println("Magician is performing");
    }
}

public class B_One {

    public static void main(String[] args) {
        List<Performer> li = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of perfomers: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the type of perfomers: (Singer/Dancer/Magician) ");
        for (int i = 0; i < n; i++) {
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Singer")) {
                li.add(new Singer());
            } else if (type.equalsIgnoreCase("Dancer")) {
                li.add(new Dancer());
            } else if (type.equalsIgnoreCase("Magician")) {
                li.add(new Magician());
            } else {
                System.out.println("Invaild Input");
                i--;
            }
        }

        System.out.println("Start the performance in order: ");
        for (Performer p : li) {
            p.perform();
        }
    }
}
