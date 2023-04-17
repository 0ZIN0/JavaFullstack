package orderingSystem;

public class Menu {
	private String name;
	private double price;
	private String description;
	
	public Menu(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return name + "(" + price + "원): " +description;
	}
}
