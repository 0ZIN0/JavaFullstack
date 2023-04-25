package database.quiz.potterWheel;

public class Prize {
	
	String name;
	int price;
	int qty;
	double rate;
	
	public Prize(String name, int price, int qty, double rate) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.rate = rate;
	}
	
	public int getQty() {
		return qty;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%d/%.3f]", name, qty, rate);
	}
}
