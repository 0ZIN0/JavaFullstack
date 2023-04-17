package myobj;

public class Bucket {
	
	public int[] gap = new int[20];
	
	public Bucket() {
		
		for(int i = 0; i < 4; i++) {
			
			int index = (int)(Math.random() * 20);
			
			gap[index] = gap[index] != 1 ? 1 : --i;
		}
	}
	
	public int check(int num) {
		
		int check = 0;
		
		if(gap[num] == 0) {
			
			gap[num] = 2;
		
		} else if(gap[num] == 1) {
			
			check = 1;
			
		} else if(gap[num] == 2) {
			
			check = 2;
		}
		
		return check;
	}
}
