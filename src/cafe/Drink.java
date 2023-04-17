package cafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drink {
	
	List<String> coffee = new ArrayList<>();
	List<String> smoothie = new ArrayList<>();
	List<String> tea = new ArrayList<>();
	final private String[] hotIce = new String[] {"HOT", "ICE"};
	
	public Drink() {
		Collections.addAll(coffee, "아메리카노", "카페라떼", "바닐라라떼", "카페모카");
		Collections.addAll(smoothie, "딸기 스무디", "초코 스무디", "녹차 스무디", "망고 스무디");
		Collections.addAll(tea, "캐모마일", "루이보스", "얼그레이", "페퍼민트");	
	}
}
