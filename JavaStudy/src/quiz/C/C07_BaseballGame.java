package quiz.C;

import java.util.Arrays;
import java.util.Scanner;

import myobj.Baseball;
import myobj.Baseball2;

public class C07_BaseballGame {
	
	/*
	 	# 숫자 야구 게임
	 	
	 	  게임이 시작되면 정답이 랜덤으로 생성된다
	 	  정답은 랜덤 4자리의 중복없는 숫자
	 	  플레이어에게는 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다
	 	  플레이어가 입력한 숫자의 번호와 위치가 모두 맞으면 스트라이크라고 한다
	 	  플레이어가 입력한 숫자의 번호는 맞되 위치가 틀리면 볼이라고 한다
	 	  플레이어가 9번의 기회 안에 모든 숫자와 위치를 맞추면 사용자의 승리
	 	  모든 기호 소진시 플에이어 패배
	 	  
	 	  ex> 정답이 3791인 경우
	 	  
	 	  	  사용자가 9081이라고 입력하면 1strike 1ball
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Baseball2 b2 = new Baseball2();
		String nums;
		System.out.println(Arrays.toString(b2.answer));
		while(true) {
			
			while(true) {
				
				cnt++;
				
				System.out.print("번호를 입력하세요 >>");
				nums = sc.next();
				
				if(b2.checkDup(nums)) {
					break;
				}
				
				System.out.println("중복된 숫자가 있습니다 다시 입력해주세요");
			}	
			
			if(b2.check(nums)) {
				System.out.println(cnt + "회만에 정답을 맞췄습니다");
				break;
			} else if(cnt == 9) {
				System.out.println("실패했습니다 정답은" + Arrays.toString(b2.answer));
				break;
			}
		}
	}
}
