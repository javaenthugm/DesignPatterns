package vidtut06.pattern.abstractfactory;

interface Shape {
	public void draw();
}

class Circle implements Shape{
	public void draw(){
		System.out.println("Drawing Circle..");
	}
}

class Triangle implements Shape{
	public void draw(){
		System.out.println("Drawing Triangle...");
	}
}

class Square implements Shape{
	public void draw(){
		System.out.println("Drawing Square");
	}
}