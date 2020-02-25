package Lab9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		
		ExecutorService service=Executors.newFixedThreadPool(5);
		Runnable task1=new IncrementRunnable("First thread");
		service.submit(task1);
		
		Runnable task2=new IncrementRunnable("Second thread");
		service.submit(task2);
		
		service.shutdown();
	}

}
