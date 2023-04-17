package quiz.D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruit {
	
	// 다음 과일들로 이루어진 1000개 크기의 String 타입 랜덤 배열을 생성하고
	// 각 과일이 몇 번 등장했는지 세어보세요
	public static String[] fruits = {
			"Apple", "Banana", "Mango", "Grape", "Peach",
			"Watermelon", "Pineallple", "Pitaya"
	};
	
	public static void main(String[] args) {
		
		List<String> fruitArr = new ArrayList<>();
		
		HashMap<String, Integer> box2 = new HashMap<>();
		
		while(fruitArr.size() < 1000) {
			fruitArr.add(fruits[(int)(Math.random() * fruits.length)]);
		}
		for(int i = 0; i < fruitArr.size(); i++) {
			box2.put(fruitArr.get(i), Collections.frequency(fruitArr, fruitArr.get(i)));
			if(box2.size() == fruits.length) {
				break;
			}
		}
		System.out.println(box2);
		
		HashMap<String, Integer> fruitCount = new HashMap<>();
		for(int i = 0; i < fruits.length; i++) {
			fruitCount.put(fruits[i], 0);
		}
		for(int i = 0; i < fruitArr.size(); i++) {
			String name = fruitArr.get(i);
			int count = fruitCount.get(name);
			fruitCount.put(name,count + 1);
		}
		
		System.out.println(fruitCount);
	}
}
