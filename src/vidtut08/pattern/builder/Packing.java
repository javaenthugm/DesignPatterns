package vidtut08.pattern.builder;

class Wrapper implements Packing{
	public String pack() {
		return "Wrapper";
	}
}

class Bottle implements Packing{
	public String pack(){
		return "Bottle";
	}
}



public interface Packing {
	
	public String pack();

}
