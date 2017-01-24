package vidtut0102.basicoopsconcepts;

public class Dog extends Animal {
	public Dog(){
		super();
		setSound("Bark");
	}
	
	
	public void passByValue(int randomVar){
		randomVar = 12;
		System.out.println("randomVar inside the method " +randomVar);
	}
	
	public void passByObject(Dog dog){
		dog.setName("New Name");
	}

}
