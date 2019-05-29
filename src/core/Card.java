package core;

public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public Rank getRank() {
		return this.rank;
	}

	public boolean isBube() {
		return Rank.BUBE == this.rank;
	}

	@Override
	public String toString() {
		return suit.getSymbol() + rank.getSymbol();
	}
}