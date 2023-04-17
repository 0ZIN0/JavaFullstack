package D00;

import java.util.Date;

public class D11_Date {
	
	/*
	 	# java.util.Date
	 	
	 	  시간 및 날짜를 정보를 보관할 수 있는 클래스
	 	  오래된 클래스이기 때문에 데이터를 보관하는 용도로만 사용하고 
	 	  메서드는 잘 사용하지 않는다
	 */
	
	public static void main(String[] args) {
		
		// 아무것도 안넣고 생성하면 현재 시간
		Date d1 = new Date();
		System.out.println(d1);
		
		// long타입 값을 전달하여 유닉스 타임으로 시간을 생성
		Date d2 = new Date(100000000000L);
		System.out.println(d2);
		
		/*
		 	System.currentTimeMillis() : 시스템으로 부터 현재 유닉스 타임을 받아온다
			* Unix Time - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지 1/1000초로 센 것
		 */
		System.out.println("현재 시간 : " + System.currentTimeMillis());
		System.out.println("Unix Time 0 : " + new Date(0L));
		System.out.println("Unix Time -50000000 : " + new Date(-50000000L));
		System.out.println("Unix Time 50000000 : " + new Date(50000000L));
		System.out.println("Unix Time 현재 시간 : "
					+ new Date(System.currentTimeMillis()));
		
		Date now = new Date();
		Date longTimeAgo = new Date(0L);
		
		// date.after(anotherDate) : 해당 시간이 전달한 시간보다 뒤인지 물어본다
		System.out.println(now.after(longTimeAgo));
		
		// date.before(anotherDate) : 해당 시간이 전달한 시간보다 앞인지 물어본다
		System.out.println(now.before(longTimeAgo));
		
		// date.getTime() : 해당 인스턴스로부터 유닉스 타임을 꺼낸다
		System.out.println(now.getTime());
		
		// date.setTime(long) : 전달한 유닉스 타임으로 시간을 변경한다
		Date children = new Date();
		
		// 5월 5일까지 반복 (month는 -1로 나옴)
		while (children.getMonth() != 4 || children.getDate() != 5) {
			long time = children.getTime();
			children.setTime(time + 1000 * 60 * 60 * 24);
		}
		System.out.println(children);
		
		// 1970년 1월 1일 오전 9시 부터 10번째 일요일을 찾아서 출력해보세요
		Date sunday = new Date(0L);
		int week = 10;
		int sundaycnt = 0;
		while(sunday.getDay() != 0 || sundaycnt < 10) {
			sunday.setTime(sunday.getTime() + 1000 * 60 * 60 * 24);
			if(sunday.getDay() == 0) {
				sundaycnt++;
			}
		}
		System.out.println(sunday);
	}
}
