package Practice_MID.WAP;
class Hero {
    String name;
    private int health;
    int power;

    Hero(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // take damage
    public void takeDamage(int d) {
        health -= d;
        if (health < 0) health = 0;
    }

    // heal
    public void heal(int h) {
        health += h;
    }

    // show stats
    public void stats() {
        System.out.println("Name: " + name + 
                " | Health: " + health + 
                " | Power: " + power);
    }
}


class Warrior extends Hero {
    int armor; // percentage

    Warrior(String name, int health, int power, int armor) {
        super(name, health, power);
        this.armor = armor;
    }

    @Override
    public void takeDamage(int d) {
        int reduced = d - (d * armor / 100);
        super.takeDamage(reduced);
    }
}


class Mage extends Hero {

    Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void heal(int h) {
        h += 10; // bonus healing
        super.heal(h);
    }
}
public class Self8 {
    public static void main(String[] args) {

        Warrior w = new Warrior("Thor", 120, 40, 30);  // 30% armor
        Mage m = new Mage("Merlin", 90, 55);

        // apply actions
        w.takeDamage(50); // warrior takes reduced damage
        m.takeDamage(50);

        w.heal(20);
        m.heal(20); // mage gets +10 bonus

        // display final stats
        System.out.println("\n=== FINAL STATS ===");
        w.stats();
        m.stats();
    }
}
