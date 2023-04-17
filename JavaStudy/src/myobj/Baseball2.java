package myobj;

import java.util.Arrays;

public class Baseball2 {
	
	public int[] answer;
	int size;
	boolean out;
	
	public Baseball2(int size) {
		
		answer = new int[size];
		
		for(int i = 0; i < answer.length; i++) {
			
			answer[i] = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; j++) {
				
				if(answer[i] == answer[j]) {
					
					i--;
					
				}
			}
		}
	}
	
	public Baseball2() {
		
		this(4);
	}
	
	public boolean checkDup(String nums) {
		
		for(int i = 0; i < nums.length(); i++) {
			
			for(int j = i + 1; j < nums.length(); j++) {
	
				if(nums.charAt(i) == nums.charAt(j)) {
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public int getStrike(String nums) {
		
		int strike = 0;
		for(int i = 0; i <answer.length; i++) {

			for(int j = 0; j < nums.length(); j++) {
				
				if(answer[i] == (int)(nums.charAt(j) - 48)) {
					
					if(i == j) {
						strike++;
					}
				}
			}	
		}
		
		return strike;
	}
	
	public int getBall(String nums) {
		
		int ball = 0;
		for(int i = 0; i < answer.length; i++) {

			for(int j = 0; j < nums.length(); j++) {
				
				if(answer[i] == (int)(nums.charAt(j) - 48)) {
					
					if(i != j) {
						ball++;
					}	
				}
			}	
		}
		
		return ball;
	}
	
	public Boolean check(String nums) {
		
		System.out.println(getStrike(nums) + "STRIKE " + getBall(nums) + "BALL");
		
		if(getStrike(nums) == 4) {
			
			return true;
		
		}
		
		return out;
	}

}
