package vidtut06.pattern.abstractfactory;

public class AbstractFactoryPatternApp {
	
	public static void main(String args[]){
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory  sf1 = fp.createFactory("Shape");
		Shape s1 = sf1.getShape("CIRCLE");
		s1.draw();
		
		Shape s11 = sf1.getShape("SQURE");
		s11.draw();
		Shape s12 = sf1.getShape("TRIANGLE");
		s12.draw();
		
		
		AbstractFactory  sf2 = fp.createFactory("Color");
		Color s2 = sf2.getColor("GREEN");
		s2.fill();
		s2 = sf2.getColor("RED");
		s2.fill();
		
	}

}
