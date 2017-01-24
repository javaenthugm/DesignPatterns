package vidtut05.pattern.factory;

public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip(){
		System.out.println(getName()+" following hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");
	}
	
	public void doDamage(){
		System.out.println(getName()+" does damage and amount "+getAmtDamage());
	}

}

class UFOShip extends EnemyShip{
	public UFOShip(){
		setName("UFO Enemy Ship");
		setAmtDamage(20.0);
	}
}

class RocketShip extends EnemyShip{
	public RocketShip(){
		setName("Rocket Enemy Ship");
		setAmtDamage(40.0);
	}
}

class BigUFOShip extends UFOShip{
	public BigUFOShip(){
		setName("Big UFO Enemy Ship");
		setAmtDamage(60.0);
	}
}