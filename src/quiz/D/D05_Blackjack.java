package quiz.D;

import java.util.Arrays;
import java.util.Scanner;

import blackJack.Game;
import blackJackAns.Deck;
import blackJackAns.Player;

public class D05_Blackjack {
	
	/*
	 	www.247blackjack.com
	 	
	 	1. 컴퓨터(딜러)와 사람(플레이어)가 카드를 뽑는다
	 	
	 	2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다
	 	
	 	3. 플레이어는 카드를 받은 후 상황을 보고
	 	   더 뽑을지(hit) 그만 뽑고 여기서 멈출지(stand)를 결정한다
	 	   hit를 선택하면 플레이어만 카드를 한 장 더 받는다
	 	   
	 	4. 플레이어가 stand를 선택하면 정해진 규칙에 따라 딜러가 카드를 뽑는다
	 	   뒤집어 놨던 카드를 오픈하고 카드를 마저 뽑는다
	 	   딜러는 의사 결정을 할 수 없고 정해진 규칙에만 따라야 한다
	 	   
	 	   ※ 딜러의 규칙 - 가진 카드 합이 16 이하라면 뽑는다 17이상이면 멈춘다
	 	   
	 	5. A는 1로 쓸 수 있고 11로 쓸 수 있다
	 	
	 	6. J, Q, K는 모두 10의 가치를 지닌다
	 	
	 	7. 가진 카드의 합이 21을 넘으면 버스트
	 	   플레이어가 버스트를 당하면 딜러는 카드를 뽑지도 않고 승리한다
	 	
	 	
	 */
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player = new Player();
		Player dealer = new Player();
		
		player.plusMoney(2500);
		
		Scanner sc = new Scanner(System.in);
		
		int betMoney = 0;
		
		while(true) {
			boolean playerBust = false;
			
			// 배팅 금액 설정
			while (betMoney < 1) {
				System.out.print("배팅 금액을 설정해주세요 : ");
				betMoney = sc.nextInt();
			}
			
			// 플레이어 2장
			player.addCard(deck.getCard());
			player.addCard(deck.getCard());
			
			// 딜러 2장
			dealer.addCard(deck.getCard());
			dealer.addCard(deck.getCard());
			
			while(true) { 
				System.out.println("현재 남은 금액 : " + player.getMoney());
				System.out.println("현재 배팅 금액 : " + betMoney);
				System.out.print("딜러 : ");
				dealer.printCardsWithNoValue();
				
				System.out.print("플레이어: ");
				player.printCards();
				
				System.out.println("1. Hit\t2. Stand");
				int select = sc.nextInt();	
				
				if(select == 1) {
					player.addCard(deck.getCard());
					
					if(player.getValue() > 21) {
						System.out.print("플레이어: ");
						player.printCards();
						System.out.println("플레이어의 버스트로 패배입니다.");
						playerBust = true;
						break;
					}
				} else if(select == 2) {
					break;
				} else {
					System.out.println("잘못 고르셨습니다. 다시 골라주세요");
				}
			}
			
			dealer.reverse(1);
			
			// 플레이어의 버스트로 탈출하거나, 스탠드로 탈출하거나
			if(playerBust) {
				// 돈계산
				player.minusMoney(500);
				
			} else {
				while (dealer.getValue() < 17) {
					dealer.addCard(deck.getCard());
				}
				
				int dealerScore = dealer.getValue();
				int playerScore = player.getValue();
				
				if(dealerScore > 21) {
					System.out.println("딜러의 버스트");
					player.plusMoney(betMoney);
					betMoney = 0;
				} else if(dealerScore == playerScore) {
					System.out.println("비김");
					// 비겼을 때는 베팅금액 유지 (추가 가능)
					System.out.println("[INFO] 베팅 금액이 그대로 유지됩니다");
					
					int additional = 0;
					while (additional < 1) {
						System.out.println("추가 베팅 금액 : ");
						additional += sc.nextInt();						
					}
					betMoney += additional;
				} else if(dealerScore > playerScore) {
					System.out.println("딜러 승");
					player.minusMoney(betMoney);
					betMoney = 0;
				} else if(dealerScore < playerScore) {
					System.out.println("플레이어 승");
					player.plusMoney(betMoney);
					betMoney = 0;
				}
			}
			// 카드 초기화
			player.reset();
			dealer.reset();
			
			System.out.println("========================================");
			System.out.println("더 하시겠습니까? 1.더한다 2.그만한다");
			System.out.print(">>");
			int select = sc.nextInt();
			System.out.println("========================================");
			
			if(select == 2) {
				System.out.println(player.getMoney() + "원으로 마무리 되었습니다");
				System.out.println("감사합니다");
				break;
			}
		}
	}
}
