package vidtut10.pattern.decorator;

interface Shape {
	public void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Plain Circle");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Plain Rectangle");
	}
}

abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape shapeTobeDecorated) {
		this.decoratedShape = shapeTobeDecorated;
	}

	public void draw() {
		decoratedShape.draw();
	}

}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shapeTobeDecorated) {
		super(shapeTobeDecorated);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setBorderColor(decoratedShape);
	}

	private void setBorderColor(Shape decoratedShape) {
		System.out.println("Border Color : Red");

	}

}

public class DecoratorPatternApp {

	public static void main(String args[]) {
		Shape circle = new Circle();
		Shape rectangle  = new Rectangle();
		Shape redCircle  = new RedShapeDecorator(circle);
		Shape redRectangle = new RedShapeDecorator(rectangle);
		circle.draw();
		rectangle.draw();
		redCircle.draw();
		redRectangle.draw();
		
	}

}
