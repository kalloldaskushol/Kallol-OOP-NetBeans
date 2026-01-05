class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
    void eat() {
        System.out.println("Dog eats food");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
//        d.eat();  // inherited from Animal
//        d.bark(); // own method

        Animal a = new Dog(); // valid because Dog IS-A Animal
        a.eat();
//        a.bark();// ❌ not allowed, reference type decides accessible methods
    }
}