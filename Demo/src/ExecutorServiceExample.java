import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(new MyTask("task 1"));
		service.submit(new MyTask("task 2"));
		service.shutdown();
	}

}

class MyTask implements Runnable {

	private String name;

	public MyTask() {
		super();
	}

	public MyTask(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			System.out.println("this is staring thread..." + name);
			Thread.sleep(2000);
			System.out.println("this is ending thread..." + name);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
