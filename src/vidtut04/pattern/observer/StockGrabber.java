package vidtut04.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	private List<Observer> observers;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		int index = observers.indexOf(deleteObserver);
		System.out.println("Observer at index " + index + "  has been deleted");
		observers.remove(index);
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public void notifyObserver() {

		for (Observer o : observers) {
			o.update(ibmPrice, applPrice, googPrice);
		}
	}

}
