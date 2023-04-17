package quiz.B;

public class B10_WhileGugudan {
	
	//구구단 2개를 while문으로 출력해보세요
	
	public static void main(String[] args) {
		
		int i = 1;
	
		while(i++ < 9) {
			
			System.out.printf("%d단: ", i);
			
			int j = 0;
			
			while(j++ < 9) {
			
				System.out.printf("%2dx%d=%-3d", i, j, i * j);
			
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int k = 0;
		
		while(k < 10) {
			
			int l = 1;
			
			while(++l < 10) {
				
				if(k == 0) {
					
					System.out.printf("%d단\t", l);
					
				} else {
					
					System.out.printf("%dx%d=%d\t", l, k, k * l);
				
				}
				
			}
			
			System.out.println();
			
			k++;
		}
	}
}
