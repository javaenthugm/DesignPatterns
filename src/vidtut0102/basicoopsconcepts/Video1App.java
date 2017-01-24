package vidtut0102.basicoopsconcepts;

public class Video1App {
	
	public static void main(String args[]){
		Dog d = new Dog();
		d.setName("Old Name");
		int randomVar = 10;
		d.passByValue(randomVar);
		System.out.println("randomVar after method call " +randomVar);
		
		System.out.println("Dog's name before method call "+d.getName());
		
		d.passByObject(d);
		System.out.println("Dog's name after method call "+d.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says " + doggy.getSound());
		System.out.println("Kitty says " + kitty.getSound());
		
	}
	
	

}
