package myobj;

import java.util.Arrays;

public class Baseball {
	
	public int[] answer;
	public int strike;
	public int ball;
	public boolean out;
	
	public Baseball() {
		
		answer = new int[4];
		
		for(int i = 0; i < 4; i++) {
			
			answer[i] = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; j++) {
				
				if(answer[i] == answer[j]) {
					
					i--;
					
				}
			}
		}
	}
	
	public boolean checkDup(String nums) {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = i + 1; j < 4; j++) {
	
				if(nums.charAt(i) == nums.charAt(j)) {
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void check(String nums) {
		
		for(int i = 0; i < 4; i++) {

			for(int j = 0; j < 4; j++) {
				
				if(answer[i] == (int)(nums.charAt(j) - 48)) {
					
					if(i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}	
		}
		
		System.out.println(strike + "Strike " + ball + "Ball");
	}
	
	public Boolean out() {
		
		if(strike == 4) {
			
			out = true;
		}
		
		strike = 0;
		ball = 0;
		return out;
	}

}
