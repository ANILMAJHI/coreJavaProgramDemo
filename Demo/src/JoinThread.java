
public class JoinThread {

	public static void main(String[] args) {

		WorkerThread t1 = new WorkerThread("Thead 1 ");
		WorkerThread t2 = new WorkerThread("Thead 2 ");
		WorkerThread t3 = new WorkerThread("Thead 3 ");
		t1.start();
		t2.start();
		t3.start();
		try {
			//t1.join();
			//t2.join();
			t3.join();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}

class WorkerThread extends Thread {
	WorkerThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Is executing...");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Is finishing...");
	}
}