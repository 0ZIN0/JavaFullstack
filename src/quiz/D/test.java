package quiz.D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		List<Integer> dices = new ArrayList<>();
		
		dices.add(2);
		dices.add(2);
		dices.add(3);
		dices.add(4);
		dices.add(5);
		
		Collections.sort(dices);
		int straight = 0;
		System.out.println(dices);
		int num = dices.get(0);
		for(int i = 0; i < 5; i++) { 
			if(dices.get(i) == num++) {
				straight++;
			} else {
				break;
			}
		}
		System.out.println(straight);
		if(straight == 5) {
			System.out.println("Large Straight");
		} else if(straight == 4){
			System.out.println("Small Straight");
		} else {
			System.out.println("nothing");
		}
	}
}
