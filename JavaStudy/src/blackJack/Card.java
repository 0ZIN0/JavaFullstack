package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Card {
	
	private String suit;
	private String rank;
	private int value;
	
	public Card() {
	
	}
	public Card(String suit, String rank, int value) {
		this.suit = suit;
		this.rank = rank;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	
	public String getRank() {
		return rank;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%s]", suit, rank);
	}
}
