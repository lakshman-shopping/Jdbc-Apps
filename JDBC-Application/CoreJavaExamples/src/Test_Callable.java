import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Runnable implements task");
		
	}
}
class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
    	System.out.println(Thread.currentThread().getName()+ " Callable implements task");
    	return 5;
    }
}
public class Test_Callable {
      public static void main(String[] args) {
		System.out.println("main start");
        
		//Thread th1 = new Thread(new MyRunnable());
		//th1.start();
		
		 
		//ExecutorService service = Executors.newSingleThreadExecutor();
		//ExecutorService service = Executors.newFixedThreadPool(5);
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(new MyRunnable());
		service.submit(new MyRunnable());
		service.submit(new MyRunnable());
		service.submit(new MyRunnable());
		service.submit(new MyRunnable());
		service.submit(new MyCallable());
		service.submit(new MyCallable());
		service.submit(new MyCallable());
		service.submit(new MyCallable());
		service.submit(new MyCallable());
		
		service.shutdown();
		//service.shutdownNow();
		
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		
		Future<Integer> runnableFuture = service1.submit(new MyCallable());
		int runnableResult;
		try {
			runnableResult = runnableFuture.get();
			System.out.println("runnablrResult: " + runnableResult);
		} catch (InterruptedException | ExecutionException e) {
			
			e.printStackTrace();
		}
		System.out.println("main end");
		
	}
}
