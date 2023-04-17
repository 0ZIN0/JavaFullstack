package blackJack;

import java.util.Scanner;

public class Game {
	
	Player player;
	Dealer dealer;
	Deck deck;
	Scanner sc;
	
	public Game() {
		player = new Player();
		dealer = new Dealer();
		deck = new Deck();
		sc = new Scanner(System.in);
	}
	
	public void gameStart() {
		deck.shuffle();
		
		player.drawCard(deck.draw());
		player.drawCard(deck.draw());
		
		dealer.drawCard(deck.draw());
		dealer.drawCard(deck.draw());
		System.out.println("=================================================");
		System.out.println("Dealer's card : [[], " + dealer.hide() + "]");
		System.out.println("=================================================");
		
		int playerValue = player.getValue();
		
		while(playerValue < 21) {
			System.out.println("Player's card : " + player.getHand());
			System.out.println("Player's value : " + playerValue);
			System.out.print("stand or hit? (input 1 or 2) >>");
			int select = sc.nextInt();
			if(select == 2) {
				player.drawCard(deck.draw());
				playerValue = player.getValue();
			} else {
				break;
			}
		}
		
		System.out.println("=================================================");
		System.out.println("Player's card : " + player.getHand());
		System.out.println("Player's value : " + playerValue);
		System.out.println("=================================================");
		
		int dealerValue = dealer.getValue();
		
		while(dealerValue < 17) {
			dealer.drawCard(deck.draw());
			dealerValue = dealer.getValue();
			System.out.println("Dealer's card : " + dealer.getHand());
			System.out.println("Dearler's value : " + dealerValue);
			
		}
		
		System.out.println("====================RESULT=======================");
		System.out.println("Dealer's card : " + dealer.getHand());
		System.out.println("Dearler's value : " + dealerValue);
		System.out.println("Player's card : " + player.getHand());
		System.out.println("Player's value : " + playerValue);
		
		if (playerValue > 21) {
            System.out.println("You Bust, Dealer's Win"); 
		} else if (dealerValue > 21) {
            System.out.println("Dealer's Bust, You Win!");
        } else if (playerValue < dealerValue) {
			System.out.println("Dealer's Win");
        } else if (playerValue > dealerValue) {
			System.out.println("You Win!");
        } else {
            System.out.println("Push");
        }
	}
}
