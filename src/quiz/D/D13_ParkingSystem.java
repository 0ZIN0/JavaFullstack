package quiz.D;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myobj2.Car;

public class D13_ParkingSystem {
	
	Car car;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		DayOfWeek dow = today.getDayOfWeek();
		LocalDate start = LocalDate.of(2018, 9, 1);
		
		LocalDate afterdays = today.plusDays(4);
		Car car = new Car();
		
		String number = car.getNumbers();
		char lastNum = number.charAt(number.length() - 1);

//		String carNum = sc.nextLine();
//		while(isCarNum(carNum)) {
//			System.out.println("올바른 차량번호가 아닙니다.올바른 차량번호를 입력하세요");
//			carNum = sc.nextLine();
//		}
		
		if(today.isAfter(start)) {
			System.out.println("===========차량 5부제 시행중===========");
			System.out.println(today + " " + dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
			System.out.printf("[%s] [%s]\n", car.getNumbers(), car.getType());
			
			if(car.getType().equals("해당없음")) {
				if(dow.getValue() >= 6) {
					System.out.println("공휴일은 적용제외입니다 통과하세요");
				} else if(check(afterdays,number)) {
					System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN) +
							"요일에는 끝번호가 " + lastNum + "인 번호는 출입제한입니다");
				} else {
					System.out.println("통과");
				}
			} else {
				System.out.println(car.getType() + "차량은 제외차량입니다 통과하세요");
			}			
		} else {
			System.out.println("차량 5부제는 2018년 9월 1일부터 시행입니다 통과하세요");
		}
		
	}
	
	public static boolean check(LocalDate today, String number) {
		char lastNum = number.charAt(number.length() - 1);
		DayOfWeek dow = today.getDayOfWeek();
		int num = (int)(lastNum - '0');
		if(dow.getValue() >= 6) {
			return false;
		}
		
		return num > 5 ? num % 5 == dow.getValue() : num == dow.getValue();
	}

	public static boolean isCarNum(String numbers) {
		return Pattern.matches("\\d{2}[가-하]\\d{4}", numbers);
	}
}
