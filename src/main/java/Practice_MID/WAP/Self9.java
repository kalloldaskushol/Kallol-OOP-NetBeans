package Practice_MID.WAP;

class Plan {
    String user;
    int daysLeft;
    double cost;

    Plan(String user, double cost) {
        this.user = user;
        this.cost = cost;
        this.daysLeft = 0;
    }

    public void useDay() {
        if (daysLeft > 0) {
            daysLeft--;
            System.out.println(user + " used 1 day.");
        } else {
            System.out.println("❌ No active days left.");
        }
    }

    public void recharge(int days) {
        daysLeft += days;
        System.out.println("✔ Recharged " + days + " days.");
    }

    public void planInfo() {
        System.out.println("User: " + user +
                " | Days Left: " + daysLeft +
                " | Cost: " + cost);
    }
}
class BasicPlan extends Plan {

    BasicPlan(String user, double cost) {
        super(user, cost);
    }

    @Override
    public void recharge(int days) {
        if (days > 30) {
            System.out.println("❌ BasicPlan recharge failed: max 30 days allowed.");
        } else {
            super.recharge(days);
        }
    }
}
class PremiumPlan extends Plan {

    PremiumPlan(String user, double cost) {
        super(user, cost);
    }

    @Override
    public void recharge(int days) {
        cost = cost - (cost * 0.10);   // 10% discount applied during recharge
        super.recharge(days);          // unlimited days allowed
        System.out.println("💰 10% discount applied. New cost: " + cost);
    }
}
public class Self9 {
    public static void main(String[] args) {

        BasicPlan b = new BasicPlan("Rafi", 300);
        PremiumPlan p = new PremiumPlan("Roni", 600);

        // recharge tests
        b.recharge(25);   // valid
        b.recharge(50);   // invalid

        p.recharge(40);   // unlimited + discount
        p.recharge(20);   // another recharge + discount

        // consume days
        for (int i = 0; i < 5; i++) b.useDay();
        for (int i = 0; i < 8; i++) p.useDay();

        // final plan info
        System.out.println("\n=== FINAL PLAN DETAILS ===");
        b.planInfo();
        p.planInfo();
    }
}
