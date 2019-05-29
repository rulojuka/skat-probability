package core;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Hand> hands = new ArrayList<Hand>();
	private Hand skat;

	public Board(Hand hand1, Hand hand2, Hand hand3, Hand skat) {
		hands.add(hand1);
		hands.add(hand2);
		hands.add(hand3);
		this.skat = skat;
	}

	public boolean hasTwoBubenOnHandOnePlusSkat() {
		int buben = 0;
		for (Card card : hands.get(0).getCards()) {
			if (card.isBube()) {
				buben++;
			}
		}
		for (Card card : skat.getCards()) {
			if (card.isBube()) {
				buben++;
			}
		}
		return buben == 2;
	}

	public boolean bubenSplitOneOneInDefenders() {
		int bubenDefenderOne = 0;
		int bubenDefenderTwo = 0;
		for (Card card : hands.get(1).getCards()) {
			if (card.isBube()) {
				bubenDefenderOne++;
			}
		}
		for (Card card : hands.get(2).getCards()) {
			if (card.isBube()) {
				bubenDefenderTwo++;
			}
		}
		if (bubenDefenderOne == bubenDefenderTwo && bubenDefenderOne == 1) {
			return true;
		}
		return false;
	}
	
	public int numberOfKaroTrumpsInHand(int hand) {
		int trumps = 0;
		for (Card card : hands.get(hand).getCards()) {
			if (card.isBube() || card.isKaro()) {
				trumps++;
			}
		}
		return trumps;
	}
	
	public int numberOfKaroTrumpsInSkat() {
		int trumps = 0;
		for (Card card : skat.getCards()) {
			if (card.isBube() || card.isKaro()) {
				trumps++;
			}
		}
		return trumps;
	}
	

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Spieler 1: ");
		for (Card card : hands.get(0).getCards()) {
			stringBuilder.append(card + " ");
		}
		stringBuilder.append("\n");

		stringBuilder.append("Spieler 2: ");
		for (Card card : hands.get(1).getCards()) {
			stringBuilder.append(card + " ");
		}
		stringBuilder.append("\n");

		stringBuilder.append("Spieler 3: ");
		for (Card card : hands.get(2).getCards()) {
			stringBuilder.append(card + " ");
		}
		stringBuilder.append("\n");

		stringBuilder.append("Skat: ");
		for (Card card : skat.getCards()) {
			stringBuilder.append(card + " ");
		}
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}

}
