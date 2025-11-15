package Practice_MID.WAP;

class Ticket {
    String destination;
    double fare;

    // 1️⃣ Default constructor
    Ticket() {
        this.destination = "Unknown";
        this.fare = 20;  // minimum allowed
    }

    // 2️⃣ Destination only
    Ticket(String destination) {
        this.destination = destination;
        this.fare = 20;  // minimum allowed
    }

    // 3️⃣ Destination + fare
    Ticket(String destination, double fare) {
        this.destination = destination;
        this.fare = (fare < 20) ? 20 : fare;  // fare cannot be less than 20
    }

    // 🔹 apply coupon but fare must not go below 20
    void applyCoupon(int amount) {
        this.fare -= amount;
        if (this.fare < 20) {
            this.fare = 20;
        }
    }

    // 🔹 print ticket details
    void printTicket() {
        System.out.println("Destination: " + destination + " | Fare: " + fare);
    }
}

public class Self5 {
    public static void main(String[] args) {
        // create 3 tickets using 3 constructors
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket("Dhaka");
        Ticket t3 = new Ticket("Cox's Bazar", 120);

        // apply coupons 5, 50, 10 respectively
        t1.applyCoupon(5);
        t2.applyCoupon(50);
        t3.applyCoupon(10);

        // print ticket details
        t1.printTicket();
        t2.printTicket();
        t3.printTicket();
    }
}
