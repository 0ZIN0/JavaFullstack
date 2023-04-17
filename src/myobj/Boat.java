package myobj;

public class Boat {
	
	static int capacity = 10;
	public static int max_speed = 200;
	
	public int speed;
	public int acc;
	public int man;
	
	public void ride() {
		
		if(++man == capacity) {
			
			System.out.println("정원 초과");
			
		} else {
			
			System.out.printf("1명 탑승, 현재 인원 %d명\n", man);
		}
	}
	
	public int speedUp(int acc) {
		
		return speed += acc;
		
	}
	
}
