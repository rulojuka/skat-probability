package main;

import core.Board;
import core.BoardDealer;
import core.ShuffledDeck;
import core.TwoHandDistribution;

public class TrumpSuitDistributionProbability {
	public static void main(String[] args) throws Exception {
		BoardDealer boardDealer = new BoardDealer();
		int handOnePlusSkat;
		int handTwo;
		int handThree;
		int max = 10000000;
		
		TwoHandDistribution[] distributionForNKaroCardsWithFirstPlayer = new TwoHandDistribution[12];
		for(int i=0; i<distributionForNKaroCardsWithFirstPlayer.length; i++) {
			distributionForNKaroCardsWithFirstPlayer[i] = new TwoHandDistribution();
		}
		
		for(int counter =0; counter < max; counter ++) {
			Board board = boardDealer.dealBoard(new ShuffledDeck());
			
			handOnePlusSkat = board.numberOfKaroTrumpsInHand(0) + board.numberOfKaroTrumpsInSkat();
			handTwo = board.numberOfKaroTrumpsInHand(1);
			handThree = board.numberOfKaroTrumpsInHand(2);
			
			int lesser = Math.min(handTwo, handThree);
			
			distributionForNKaroCardsWithFirstPlayer[handOnePlusSkat].addOneTo(lesser);
		}

		System.out.println("Total de mãos: " + max);
		for(int i=0; i<distributionForNKaroCardsWithFirstPlayer.length; i++) {
			System.out.println("Distribuição para " + i + " trunfos com o carteador:");
			for(int j=0;j<11-i;j++) {
				if(j > (11-i-j)) {
					break;
				}
				TwoHandDistribution current = distributionForNKaroCardsWithFirstPlayer[i];
				int value = current.get(j);
				int total = current.getTotal();
				System.out.println(j + "/" + (11-i-j) + ": " + value + ". Proporção: " + (double) value / total);
			}
			System.out.println();
		}
	}
}
