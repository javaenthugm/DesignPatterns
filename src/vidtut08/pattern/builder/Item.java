package vidtut08.pattern.builder;

abstract class Burger implements Item {
	public Packing packing() {
		return new Wrapper();
	}
}


class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veggie Burger";
	}
	@Override
	public float price() {
		return 6f;
	}
}

class ChickenBurger extends Burger{
	public String name(){
		return "Chicken Burger";
	}
	public float price(){
		return 8f;
	}
}


abstract class ColdDrink implements Item {
	public Packing packing() {
		return new Bottle();
	}
}

class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 2f;
	}
}

class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 3f;
	}
}
public interface Item {

	public String name();

	public Packing packing();

	public float price();
}
