package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	private List<Card> hand;
	
	public Dealer() {
		hand = new ArrayList<>();
	}
	
	public void drawCard(Card card) {
		hand.add(card);
	}
	
	public int getValue() {
		int value = 0;
		int aceCount = 0;
		for(Card card : hand) {
			if(card.getRank().equals("ACE")) {
				aceCount++;
			}
			value += card.getValue();
		}
		while(aceCount > 0 && value > 21) {
			value -= 10;
			aceCount--;
		}
		return value;
	}
	public Card hide() {
		return hand.get(1);
	}
	
	public List<Card> getHand() {
		return hand;
	}
}
