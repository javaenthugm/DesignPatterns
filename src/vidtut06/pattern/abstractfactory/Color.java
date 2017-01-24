package vidtut06.pattern.abstractfactory;

interface Color {
	public void fill();
}

class Blue implements Color{
	public void fill(){
		System.out.println("Filling with Blue color...");
	}
}

class Red implements Color{
	public void fill(){
		System.out.println("Filling with Red color..");
	}
}

class Green implements Color{
	public void fill(){
		System.out.println("Filling with Green color");
	}
}