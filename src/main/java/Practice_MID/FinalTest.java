package Practice_MID;

class Task {
    String note;
    Task(String n){ note = n; }

    void work(Task t) {
        t.note += "->A";
        t = new Task("B");
        t.note += "->C";
    }
}

public class FinalTest {
    public static void main(String[] args) {
        Task t1 = new Task("Start");
        Task t2 = new Task("Start");
        Task t3 = t1;

        t1.work(t2);
        t3.work(t1);

        System.out.println(t1.note);
        System.out.println(t2.note);
        System.out.println(t3.note);
    }
}
