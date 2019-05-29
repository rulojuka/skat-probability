package main;

import core.Board;
import core.BoardDealer;
import core.ShuffledDeck;

public class SuitProbabilityWithSixRemaining {
	public static void main(String[] args) throws Exception {
		BoardDealer boardDealer = new BoardDealer();
		int counter = 0;
		int handOnePlusSkatWithFiveBubenAndKaro = 0;
		int sixZero = 0;
		int fiveOne = 0;
		int fourTwo = 0;
		int threeThree = 0;
		int max = 10000000;
		while (counter < max) {
			counter++;
			Board board = boardDealer.dealBoard(new ShuffledDeck());
			int handOnePlusSkat = board.numberOfKaroTrumpsInHand(0) + board.numberOfKaroTrumpsInSkat();
			if (handOnePlusSkat == 5) {
				handOnePlusSkatWithFiveBubenAndKaro++;
				int handTwo = board.numberOfKaroTrumpsInHand(1);
				int handThree = board.numberOfKaroTrumpsInHand(2);
				if (handTwo + handThree != 6) {
					throw new RuntimeException("Deu ruim");
				}
				int greater = Math.max(handTwo, handThree);
				switch (greater) {
				case 3:
					threeThree++;
					break;
				case 4:
					fourTwo++;
					break;
				case 5:
					fiveOne++;
					break;
				case 6:
					sixZero++;
					break;
				default:
					throw new RuntimeException("Ixi, ferrou");
				}
			}
		}

		System.out.println("Total de mãos: " + counter);
		System.out.println(
				"Total de mãos com mão 1 + skat com 5 ouros ou valetes: " + handOnePlusSkatWithFiveBubenAndKaro);
		System.out.println("Divisão das outras seis cartas do naipe: ");
		System.out.println("6/0: " + sixZero + " Proporção: " + (double) sixZero / handOnePlusSkatWithFiveBubenAndKaro);
		System.out.println("5/1: " + fiveOne + " Proporção: " + (double) fiveOne / handOnePlusSkatWithFiveBubenAndKaro);
		System.out.println("4/2: " + fourTwo + " Proporção: " + (double) fourTwo / handOnePlusSkatWithFiveBubenAndKaro);
		System.out.println(
				"3/3: " + threeThree + " Proporção: " + (double) threeThree / handOnePlusSkatWithFiveBubenAndKaro);

	}
}
