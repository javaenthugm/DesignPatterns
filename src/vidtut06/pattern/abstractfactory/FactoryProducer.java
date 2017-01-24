package vidtut06.pattern.abstractfactory;

public class FactoryProducer {

	public AbstractFactory createFactory(String whatKind){
		if(whatKind=="Shape"){
			return new ShapeFactory();
		}else if(whatKind == "Color"){
			return new ColorFactory();
		}else{
			return null;
		}
	}
}
