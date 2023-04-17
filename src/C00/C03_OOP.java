package C00;

import java.util.Random;
import java.util.Scanner;

import myobj.Cart;

public class C03_OOP {
	
	/*
	 	# 객체 지향 프로그래밍 (Object Oriented Programming)
	 	
	 	  변수와 함수들을 실제로 세상에 존재하는 실제 개념(객체)으로 묶어서 사용하는
	 	  프로그래밍 방법론	
	 	  
	 	  변수와 함수들을 무분별하게 사용하다보면 여러 문제들이 발생하기 때문에
	 	  현실에 존재하는 객체 단위로 묶어서 표현하기 시작했다
	 	  
	 	  변수는 객체의 현재 상태를 나타낸다
	 	  
	 	  객체 내부의 함수는 해당 객체의 상태(변수)를 변화시킨다
	 	  이를 메서드라고 부른다
	 	  
	 	ex : 책
	 	
	 	  책의 현재 상태(변수) : 
	 	  	현재 펼쳐져있는 페이지, 전체 페이지, 발행일, 각 페이지의 낙서 여부
	 	  	각 페이지에 필기가 되어있는 위치의 좌표, 가격, 할인율
	 	  
	 	  책의 기능 (메서드) : 다음 페이지로 넘기기,
	 	    여러 페이지 넘기기, 한 장 넘기기, 지우개, ...
	 	
	 	
	 	# 클래스 (class)
	 	
	 	  객체지향 프로그래밍의 객체를 프로그래밍 언어로 표현하는 문법
	 	  클래스는 해당 객체의 설계도 역할을 한다
	 	  클래스를 정의한 시점에서는 실체가 없다
	 	  클래스를 통해 만들어내는 실제 객체를 인스턴스(instance)라고 부른다
	 	  클래스를 통해 인스턴스를 생성할 때 new를 사용한다 
	 	  
	 	  
	*/
	
	public static void main(String[] args) {
		
		// Apple이라는 설계도로 실체(인스턴스)를 만들었다
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		Apple[] apples = new Apple[100];
		String[] animals = new String[10];
		
		// 인스턴스에 .을 찍고 해당 클래스의 변수와 메서드를 사용할 수 있다
		a1.price = 800;
		a2.price = 2000;
		
		// 메서드는 모두 똑같은 동작을 하지만 각 인스턴스의 상태값에 따라 결과가 달라질 수 있다
		System.out.println(a1.toDollar());
		System.out.println(a2.toDollar());
		
		Book b1 = new Book();
		
		b1.next();
		b1.next();
		b1.next();
		
		System.out.println("현재 페이지는 " + b1.currPage);
		
		b1.prev();
		b1.prev();
		
		System.out.println("현재 페이지는 " + b1.currPage);
		
		Tv t1 = new Tv();
		
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		
		System.out.println("현재 채널 : " + t1.channel);
		System.out.println("현재 채널 : " + t1.channel);
		
		Oven o1 = new Oven();
		
		System.out.print("시간을 설정하세요 >>");
		int cookTime = sc.nextInt();
		o1.setTime(cookTime);
		System.out.println();
		System.out.print("모드를 설정하세요 >>");
		int mode = sc.nextInt();
		o1.setMode(mode);
		
		// 이곳은 default 패키지이기 때문에 myobj 패키지의
		// 무언가를 가져다 쓰려면 public이 필요하다
		
		Cart cart1 = new Cart();
		
		cart1.name = "연습카트";
		cart1.break_power = 5;
		cart1.acc = 10;
		cart1.speed = 0;
		
		cart1.plusSpeed();
	}
}

// Apple 객체의 설계도 (class)
class Apple {
	
	// 클래스의 인스턴스 변수(인스턴스마다 값이 다름)
	// = 멤버 변수, 속성, 필드 ... 등등
	int price;
	int taste;
	
	// 클래스의 인스턴스 메서드 (가지고 있는 인스턴스 변수에 따라 결과가 다름)
	
	// 현재 사과 가격을 달러로 변환하여 반환해주는 메서드
	double toDollar() {
		return price * 0.00083;
	}
	

}
	
class Book {
	
	int currPage;
	
	void next() {
		
		++currPage;
	}
	
	void prev() {
		
		--currPage;
	}
}



/*
 	실제로 존재하는 객체를 하나 참고하여 클래스를 생성한 후
 	해당 클래스의 인스턴스를 생성하고 인스턴스의 상태를 출력해보세요
 	(단, 인스턴스 변수 3개 이상, 메서드 2개 이상, 책, 과일 금지)
 */

class Tv {
	
	int channel;
	int volume;
	boolean onOff;
	
	void channelUp() {
		
		++channel;
	}
	
	void channelDown() {
		
		--channel;
	}
	
	void volumeUp() {
		
		++volume;
	}
	
	void volumeDown() {
		
		--volume;
	}
	
	void on() {
		
		onOff = true;
	}
	
	void off() {
		
		onOff = false;
	}
		
}

class Oven {
	
	int hour;
	int minute;
	int degree;
	boolean onOff;
	
	void setTime(int cookTime) {
		
		hour = hour + cookTime / 60;
		minute = minute + cookTime % 60;
		
		if (minute > 59) {
			hour = hour + 1;
			minute = minute % 60;
		};
		
		System.out.printf("%d시간 %d분", hour % 24, minute);
	}
	
	void setMode (int mode) {
		
		if(mode == 1) {
			
			System.out.println("toast mode");
			degree = 80;
			
		} else if(mode == 2) {
			
			System.out.println("pizza mode");
			degree = 120;
			
		} else if(mode == 3) {
			
			System.out.println("chiken mode");
			degree = 180;
			
		}
	}
	
	
}














