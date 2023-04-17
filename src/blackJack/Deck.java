package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Deck{
	
	private List<Card> cards;
	String[] suits;
	String[] ranks;
	int[] values;
	
	public Deck() {
		suits = new String[] {"Spade", "Club", "Heart", "Diamond"};
		ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
		values = new int[] {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
		cards = new ArrayList<>();
		
		fill();
	}
	
	public void fill() {
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++) {
				Card card = new Card(suits[i], ranks[j], values[j]);
				cards.add(card);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	public List<Card> getCards() {
		return cards;
	}
}
