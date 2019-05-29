package main;

import core.Board;
import core.BoardDealer;
import core.ShuffledDeck;

public class NonTrumpSuitProbabilityWithFourRemaining {
	public static void main(String[] args) throws Exception {
		BoardDealer boardDealer = new BoardDealer();
		int counter = 0;
		int handOnePlusSkatWithFourNonBubenKaro = 0;
		int fourZero = 0;
		int threeOne = 0;
		int twoTwo = 0;
		int max = 10000000;
		while (counter < max) {
			counter++;
			Board board = boardDealer.dealBoard(new ShuffledDeck());
			int handOnePlusSkat = board.numberOfNotBubeKaroInHand(0) + board.numberOfNotBubeKaroInSkat();
			if (handOnePlusSkat == 3) {
				handOnePlusSkatWithFourNonBubenKaro++;
				int handTwo = board.numberOfNotBubeKaroInHand(1);
				int handThree = board.numberOfNotBubeKaroInHand(2);
				if (handTwo + handThree != 4) {
					throw new RuntimeException("Deu ruim");
				}
				int greater = Math.max(handTwo, handThree);
				switch (greater) {
				case 2:
					twoTwo++;
					break;
				case 3:
					threeOne++;
					break;
				case 4:
					fourZero++;
					break;
				default:
					throw new RuntimeException("Ixi, ferrou");
				}
			}
		}

		System.out.println("Total de mãos: " + counter);
		System.out.println(
				"Total de mãos com mão 1 + skat com 4 ouros que não são valetes: " + handOnePlusSkatWithFourNonBubenKaro);
		System.out.println("Divisão das outras quatro cartas do naipe: ");
		System.out.println("4/0: " + fourZero + " Proporção: " + (double) fourZero / handOnePlusSkatWithFourNonBubenKaro);
		System.out.println("3/1: " + threeOne + " Proporção: " + (double) threeOne / handOnePlusSkatWithFourNonBubenKaro);
		System.out.println(
				"2/2: " + twoTwo + " Proporção: " + (double) twoTwo / handOnePlusSkatWithFourNonBubenKaro);

	}
}
