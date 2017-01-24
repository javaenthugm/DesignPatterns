package vidtut09.pattern.prototype;

interface Animal extends Cloneable{
	public Animal makeCopy(Animal animal);
}

class Sheep implements Animal{

	public Sheep(){
		System.out.println("Creating sheep using constructor..");
	}
	
	public Animal makeCopy(Animal animal) {
	
		Sheep cloneSheep = null;
		
		try {
			cloneSheep = (Sheep)super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloneSheep;
	}
	
}

public class PrototypePatternApp {

	public static void main(String args[]){
		Sheep newSheep = new Sheep();
		
		Sheep clonedSheep = (Sheep)newSheep.makeCopy(newSheep);
		
		System.out.println("New Sheep's hashCode " + System.identityHashCode(newSheep));
		System.out.println("Cloned Sheep's hashCode " + System.identityHashCode(clonedSheep));
	}
}
