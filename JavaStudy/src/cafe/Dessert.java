package cafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dessert {
	
	List<String> cake = new ArrayList<>();
	Boolean slice;
	
	public Dessert() {
		Collections.addAll(cake, "초코 케이크", "딸기 케이크", "녹차 케이크");
	}
}
