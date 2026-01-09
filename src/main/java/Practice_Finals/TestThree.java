class Download extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++){
			System.out.println(Thread.currentThread().getName() + " downloading item " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class TestThree {
	public static void main (String[] args) throws InterruptedException {
		Download A = new Download();
		A.setName("A");
		Download B = new Download();
		B.setName("B");
		
		A.start();
		B.start();
		
		A.join();
		B.join();
		
		System.out.println("It's time for watching!");
	}
}