package vidtut07.pattern.singleton;

public class SingletonTestApp {
	
	public static void main(String args[]){
		Singleton instance1 = Singleton.getInstance();
		System.out.println("1st Instance ID: " + System.identityHashCode(instance1));
		
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("2nd Instance ID: " + System.identityHashCode(instance2));
	}

}
