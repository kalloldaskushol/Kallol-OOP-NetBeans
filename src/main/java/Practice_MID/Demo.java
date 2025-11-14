package Practice_MID;

class Person {
    String task;
    Person(String t) { task = t; }

    void assign(Person p) {
        p.task += " -> Plan";
        p = new Person("Reset");
        p.task += " -> Execute";
    }
}

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Think");
        Person p2 = new Person("Think");
        p1.assign(p2);
        System.out.println(p1.task);
        System.out.println(p2.task);
    }
}
