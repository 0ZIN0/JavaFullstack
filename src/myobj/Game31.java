package myobj;

public class Game31 {
	
	public int players;
	public int playersNum = 1;
	int[] numArr;
	public boolean lose;
	public boolean first;
	
	public Game31() {
		
		this(31);
		
	}
	
	public Game31(int size) {
		
		numArr = new int[size];
		
	}
	
	public void screen() {
		
		for(int i = 0; i < numArr.length; i++) {
			
			if(numArr[i] == 0) {
				
				System.out.print("[0]\t");
				
			} else {
				
				System.out.printf("[%d]\t", i + 1);
				
			}
			
			if(i == 14) {
				
				System.out.println();
			}
		}
		
	}
	
	public void registPlayer(int players) {
		
		this.players = players;
		
	}
	
	public boolean ifYouFirst(int num) {
		
		if(numArr[0] == 0) {
			
			if(num <= 3) {
				
				first = true;
				
			} else {
				
				System.out.println("다시 입력해주세요(1 ~ 3)");
			}
		}
		return first;
	}
	
	public boolean inRange(int num) {
		
		boolean inRange = false;
		int range = 0;
		
		for(int i = numArr.length - 1; i >= 0; --i) {
			
			if(numArr[i] == 1) {
				
				range = i + 1;
				break;
			} 
		}

		if((num - range) > 3 || (num - range) < 0) {
			
			System.out.println("잘못된 값입니다(이전 값에서 +1 ~ +3)");
			
		} else {
			
			inRange = true;
		}
		return inRange;
	}
	
	public void checkNum(int num) {
		
		if(ifYouFirst(num)) {
			
			if(inRange(num)) {
				
				for(int i = 0; i < numArr.length; i++) {
					
					if(numArr[i] == 0) {
						
						for(int j = i; j < num; j++) {
							
							numArr[j] = 1;
						}
					}
				}
			}
		}
		++playersNum;
		
		if(playersNum > players) {
			
			playersNum = 1;
		}
		
	}
	
	public boolean say31(int num) {
		
		if(num == 31) {
			
			lose = true;
			--playersNum;
		}
	
		return lose;
	
	}
}
