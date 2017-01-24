package vidtut04.pattern.observer;

public class ObserverPatternApp {
	
	public static void main(String args[]){
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		
		
		//stockGrabber.register(stockObserver1);
		
		stockGrabber.setApplPrice(100);
		stockGrabber.setIbmPrice(100);
		stockGrabber.setGoogPrice(100);
		
		
		System.out.println();
		
		StockObserver stockObserver2 = new StockObserver(stockGrabber);
		

		stockGrabber.setApplPrice(100);
		stockGrabber.setIbmPrice(100);
		stockGrabber.setGoogPrice(100);
		
		stockGrabber.unregister(stockObserver2);
		stockGrabber.setApplPrice(100);
		stockGrabber.setIbmPrice(100);
		stockGrabber.setGoogPrice(100);
		
		
	}

}
