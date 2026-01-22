class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Lion extends Animal {
    private int maneLength;

    Lion(String name, int age, int maneLength) {
        super(name, age);
        this.maneLength = maneLength; //l1 10; L2 20
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mane Length: " + maneLength);
    }
}

class Elephant extends Animal {
    private int tuskLength;

    Elephant(String name, int age, int tuskLength) {
        super(name, age);
        this.tuskLength = tuskLength; //E1 20; E3 50
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tusk Length: " + tuskLength);
    }
}

public class Main4 {
    public static void main(String[] args) {
		
        Animal[] animals = new Animal[2]; // Ref: Animal
        animals[0] = new Lion("Lion1", 5, 25);
        animals[1] = new Elephant("Ele", 10, 40);

        for (Animal a : animals) {
            a.displayInfo();
        }
    }
}
