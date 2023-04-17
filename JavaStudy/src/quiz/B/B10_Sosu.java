package quiz.B;

public class B10_Sosu {
	
	//while문만 사용해서 1000 미만의 소수를 모두 구해보세요
	
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i++ < 1000) {
			
			boolean sosu = true;
			
			double sqrt = Math.sqrt(i);
			
			int j = 2;
			
			while(sosu && j <= sqrt) {
				
				sosu &= i % j != 0;
				
				j++;
			}
			
			if(sosu) { 
				
				System.out.print(i + " ");
			
			}

		}
	}
}
