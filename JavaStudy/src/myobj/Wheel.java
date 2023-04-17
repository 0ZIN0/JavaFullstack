package myobj;

import java.util.Arrays;

public class Wheel {
	
	public String[] draw;
	public String[] prize;
	double[] rateArr; 
	int size;
	
	public Wheel() {

		draw = new String[5];
		prize = new String[] {"커피머신", "드라이기", "키친타올", "티슈"};
		rateArr = new double[] {0.1, 0.3, 0.2, 0.2};
		
		getPrize();
	}
	
	public String[] getPrize() {
		
		for(int i = 0; i < prize.length; i++) {
			for(int j = 0; j < Math.ceil(rateArr[i] * draw.length); j++) {
				int ran = (int)(Math.random() * draw.length);
				draw[ran] = prize[i];	
			}
		}
		
		for(int i = 0; i < draw.length; i++) {
			if(draw[i] == null) {
				draw[i] = "꽝";
			}
		}
		return draw;
	}
	
	public void draw() {

		int ran = (int)(Math.random() * draw.length);
		System.out.println(draw[ran] + " 당첨!");
		System.out.println();
		draw[ran] = "꽝";
	}
	
	public boolean gameEnd() {
		boolean gameEnd = false;
		for(int i = 0; i < draw.length; i++) {
			if(!draw[i].equals("꽝")) {
				gameEnd |= true;
			} 
		}
		
		return gameEnd;
	}
}
