package Practice_MID.WAP;

class Animal {

    private String name;
    private int age;
    private double weight;

    Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(double foodWeight) {
        this.weight += foodWeight * 0.8; // weight increases by 80% of food
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("-------------------------");
    }

    // Getter and Setter if needed
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

// --------------------

class Lion extends Animal {

    Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    public void hunt() {
        setWeight(getWeight() - 2); // weight decreases by 2 kg
    }
}

// --------------------

class Elephant extends Animal {

    Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    public void sprayWater() {
        System.out.println("Elephant sprays water playfully!");
    }
}

// --------------------

public class TestAnimal {
    public static void main(String[] args) {

        // Lion
        Lion simba = new Lion("Simba", 5, 180);
        simba.eat(5);      // ate 5 kg
        simba.hunt();      // hunted
        simba.makeSound();

        // Elephant
        Elephant dumbo = new Elephant("Dumbo", 10, 500);
        dumbo.eat(10);      // ate 10 kg
        dumbo.sprayWater();
        dumbo.makeSound();

        // Display final info
        System.out.println("\n=== Final Animal Information ===");
        simba.displayInfo();
        dumbo.displayInfo();
    }
}
