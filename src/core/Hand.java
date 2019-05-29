package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

	private List<Card> cards = new ArrayList<Card>();

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public void removeCard(Card card) {
		this.cards.remove(card);
	}

	public Card get(int position) {
		return this.getCards().get(position);
	}

	public int size() {
		return this.getCards().size();
	}

	public List<Card> getCards() {
		return Collections.unmodifiableList(this.cards);
	}

}
