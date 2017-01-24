package vidtut07.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonThreadTestApp {
	
	public static void main(String args[]){
		/*Thread t1 = new Thread(new Runnable() {
			public void run() {
				Singleton instance = Singleton.getInstance();
				System.out.println("Instance Id - Thread 1 :" +System.identityHashCode(instance) );
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton instance = Singleton.getInstance();
				System.out.println("Instance Id - Thread 2 :" +System.identityHashCode(instance));
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		ExecutorService executors = Executors.newFixedThreadPool(100);
		
		
		for(int i=0;i<100;i++){
			executors.submit(new Runnable() {
				
				@Override
				public void run() {
					Singleton instance = Singleton.getInstance();
					System.out.println("Instance Id:" +System.identityHashCode(instance) );
				}
			});
		}
		
		executors.shutdown();
		
		try {
			executors.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
