package orderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	List<Menu> items;
	double totalPrice;
	Menu menu;
	
	public Order() {
		items = new ArrayList<>();
	}
	public void addItem(Menu item) {
		items.add(item);
	}
	
	public double getTotalPrice() {
		totalPrice = 0.0;
		for(Menu item : items) {
			totalPrice += item.getPrice();			
		}
		return totalPrice;
	}
	
	public List<String> getItems() {
		List<String> itemsName = new ArrayList<>();
		for(Menu item : items) {
			itemsName.add(item.getName());
		}
		return itemsName;
	}
}
