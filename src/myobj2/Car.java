package myobj2;

import java.util.Arrays;

public class Car {
	
	private static char[] chars = new char[] {'가', '나', '다', '라', '마', '바', '사', '아', '자', '차', '카'
												,'타', '파', '하'};
	private static String[] types = new String[] {"해당없음", "장애인", "유아동승", "경차"};
	public String type;
	public String numbers;
	
	public Car() {
		numbers = Number();
		type = types[(int)(Math.random() * types.length)];
	}
	
	public Car(String numbers, String type) {
		this.numbers = numbers;
		this.type = type;
	}
	
	@Override
	public String toString() {
		
		return String.format("[%s], %s", numbers, type);
	}
	
	public String Number() {
	
		for(int i = 0; i < 7; i++) {
			if(i == 0) {
				numbers = String.format("%d", (int)(Math.random() * 9));
			} else if(i == 2) {
				numbers += chars[(int)(Math.random() * chars.length)];
			} else {
				numbers += String.format("%d",(int)(Math.random() * 9));
			}
		}
		return numbers;
	}
	
	public String getType() {
		return type;
	}
	
	public String getNumbers() {
		return numbers;
	}
}
