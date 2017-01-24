package vidtut06.pattern.abstractfactory;

public abstract class AbstractFactory {

	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {

		if (shape == null) {
			return null;
		}
		if (shape == "CIRCLE") {
			return new Circle();
		} else if (shape == "SQURE") {
			return new Square();
		} else if (shape == "TRIANGLE") {
			return new Triangle();
		} else {
			return null;
		}
	}
}

class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color == "RED") {
			return new Red();
		} else if (color == "BLUE") {
			return new Blue();
		} else if (color == "GREEN") {
			return new Green();
		} else {
			return null;
		}
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}