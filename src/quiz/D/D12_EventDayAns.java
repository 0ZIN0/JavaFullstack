package quiz.D;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class D12_EventDayAns {
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		List<EventInfo> eventDays = new ArrayList<>();
		
		
		
		for(int i = 0; i < 365; i++) {
			
			boolean isOnePlusOne = 
					today.get(Calendar.DATE) == 18;
			boolean isFriday = 
					today.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
			boolean isOddWeek = 
					today.get(Calendar.WEEK_OF_MONTH) % 2 == 1;
			boolean isDiscount = isFriday && isOddWeek;
			
			if(isOnePlusOne && isDiscount) {
//				System.out.printf("[%s] - 1+1 & 20%% 할인\n", sdf.format(today.getTime()));
				eventDays.add(new EventInfo(today.getTime(), "both"));
			} else if(isOnePlusOne) {
//				System.out.printf("[%s] - 1+1 Day!!\n", sdf.format(today.getTime()));
				eventDays.add(new EventInfo(today.getTime(), "1+1"));
			} else if(isDiscount) {
//				System.out.printf("[%s] - 20%% Discount Day!!\n", sdf.format(today.getTime()));
				eventDays.add(new EventInfo(today.getTime(), "20%"));
			}
			today.add(Calendar.DATE, 1);
		}
		System.out.println(eventDays);
	}
}

class EventInfo {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	Date eDay;
	String eType;
	
	public EventInfo(Date eDay, String eType) {
		this.eDay =eDay;
		this.eType = eType;
	}
	
	@Override
	public String toString() {
		
		return String.format("[%s] %s\n", eType, eDay);
	}
}
