class Cook extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " cooking item " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread got interrupted!");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished!");
    }
}

public class Q4_ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Cook A = new Cook();
		A.setName("A");
        Cook B = new Cook();
		B.setName("B");

        A.start();
        B.start();

        A.join();
        B.join();

        System.out.println("Serve customers");
    }
}