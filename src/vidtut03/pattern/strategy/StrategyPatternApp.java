package vidtut03.pattern.strategy;

interface FlyingStrategy {
	public void fly();
}

class WingsFlyingStrategy implements FlyingStrategy {
	public void fly() {
		System.out.println("I can fly");
	}
}

class NoWingsFlyingStrategy implements FlyingStrategy {
	public void fly() {
		System.out.println("Sorry I can't fly");
	}
}

class Animal {
	private String name;
	private int height;
	private String favFood;
	private FlyingStrategy flyingStrategy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public FlyingStrategy getFlyingStrategy() {
		return flyingStrategy;
	}
	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	
	public void canFly(){
		flyingStrategy.fly();
	}

}

class Dog extends Animal{
	public Dog(){
		super();
		setFlyingStrategy(new NoWingsFlyingStrategy());
	}
}

class Bird extends Animal{
	public Bird(){
		super();
		setFlyingStrategy(new WingsFlyingStrategy());
	}
}

public class StrategyPatternApp {
	
	public static void main(String args[]){
		Animal doggy = new Dog();
		Animal birdy = new Bird();
		
		doggy.canFly();
		birdy.canFly();
		
		doggy.setFlyingStrategy(new WingsFlyingStrategy());
		doggy.canFly();
	}

}
