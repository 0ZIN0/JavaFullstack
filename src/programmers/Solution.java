package programmers;

public class Solution {
	
	 public static int solution(int[] sides) {
	     int max = 0;
	     
	     for(int i = 0 ; i < sides.length; i++) {
	    	 if(max < sides[i]) {
	    		 max = sides[i];
	    	 }
	     }
	     
	     int sum = 0;
	     
	     for(int i = 0; i < sides.length; i++) {
	    		 sum += sides[i];
	     }
		 int answer = sum - max> max ? 1 : 2;
	        return answer;
	    }
	
	public static void main(String[] args) {
		int[] sides = new int[] {1,3,2};
		System.out.println(solution(sides));
	}
	
}
