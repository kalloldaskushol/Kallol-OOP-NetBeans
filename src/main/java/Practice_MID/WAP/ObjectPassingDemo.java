
package Practice_MID.WAP;

class Car {
    String model;
    int speed;

    Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void tune(Car c) {
        c.speed += 20;                 // modifies the same object
        c.model = c.model + " Turbo";  // modifies the same object

        c = new Car("Brand New", 0);   // now refers to a new object
        c.speed += 100;                // affects only the new object
    }

    void repaint(Car c) {
        c.model = "Repainted " + c.model;  // affects original
    }

    void show() {
        System.out.println(model + " running at " + speed + " km/h");
    }
}

public class ObjectPassingDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 120);
        Car c2 = new Car("Toyota", 100);

        // Pass object references
        c1.tune(c2);     // modifies c2 partially
        c2.repaint(c2);  // modifies c2 again

        c1.show();
        c2.show();
    }
}
