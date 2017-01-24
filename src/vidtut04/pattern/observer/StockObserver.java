package vidtut04.pattern.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	private int observerNumber;
	private Subject stockGrabber;
	
	
	
	private static int observerCounter;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerNumber=++observerCounter;
		System.out.println("Observer # "+observerNumber);
		stockGrabber.register(this);
		
	}
	
	public void update(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		printStocks();
	}
	
	public void printStocks(){
		System.out.println(observerNumber);
		System.out.println("\tIBM "+ ibmPrice);
		System.out.println("\tApple "+ applPrice);
		System.out.println("\tGoogle "+ googPrice);
	}

}
