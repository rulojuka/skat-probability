package core;

import java.util.ArrayList;
import java.util.List;

public class BoardDealer {

	private List<Hand> hands;
	private Hand skat;

	public Board dealBoard(ShuffledDeck shuffledDeck) {
		this.hands = new ArrayList<Hand>();
		for (int i = 0; i < 3; i++) {
			hands.add(new Hand());
		}
		skat = new Hand();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				hands.get(i).addCard(shuffledDeck.dealCard());
			}
		}
		for (int j = 0; j < 2; j++) {
			skat.addCard(shuffledDeck.dealCard());
		}
		return new Board(hands.get(0), hands.get(1), hands.get(2), skat);
	}

}