package quiz.D;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_EventDay {
	
	/*
	 	실행하면 오늘로부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
	 	
	 	1 + 1 이벤트 : 매월 18일
	 	20% 할인 이벤트 : 홀수 번째 금요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 둘 모두 적용됨을 알려줘야 한다
	 */
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar end = (Calendar) now.clone();
		end.add(Calendar.YEAR, 1);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 EEEE");
		
		while(now.before(end)) {
			now.add(Calendar.DATE, 1);
			if((now.get(Calendar.WEEK_OF_YEAR) % 2 != 0 && now.get(Calendar.DAY_OF_WEEK) == 6) 
					&& now.get(Calendar.DATE) == 18) {
				System.out.println(sdf.format(now.getTime()) + " : 1 + 1 & 20% 할인 이벤트");
				
			} else if((now.get(Calendar.WEEK_OF_YEAR) % 2 != 0 && now.get(Calendar.DAY_OF_WEEK) == 6)) {
				System.out.println(sdf.format(now.getTime()) + " : 20% 할인 이벤트");
				
			} else if(now.get(Calendar.DATE) == 18) {
				System.out.println(sdf.format(now.getTime()) + " : 1 + 1 이벤트");
			}
		}
	}
}
