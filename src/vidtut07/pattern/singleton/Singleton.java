package vidtut07.pattern.singleton;

public class Singleton {
	
	private static Singleton firstInstance = null;
	//private static final Singleton firstInstance = new Singleton();
	
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		if(firstInstance==null){
			
			
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// Lazy initialization - the object is created only when it is needed			
			synchronized (Singleton.class) {
				if(firstInstance==null){
					firstInstance = new Singleton();
				}
				
			}
			
			//firstInstance = new Singleton();
			 
		}
		return firstInstance;
	}
	
	/*public static Singleton getInstance(){
		return firstInstance;
	}*/
	
}
