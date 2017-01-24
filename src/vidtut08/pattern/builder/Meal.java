package vidtut08.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item newItem){
		items.add(newItem);
	}
	
	public float getCost(){
		float cost= 0f;
		for(Item item:items){
			cost+=item.price();
		}
		return cost;
	}
	
	public void displayItems(){
		for(Item i:items){
			System.out.print("Item :"+i.name());
			System.out.print(",Packing :"+i.packing().pack());
			System.out.println(",Price:"+i.price());
		}
	}

}
