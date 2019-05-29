package main;

import core.Board;
import core.BoardDealer;
import core.ShuffledDeck;

public class BubenSplitOneOne {
	public static void main(String[] args) throws Exception {
		BoardDealer boardDealer = new BoardDealer();
		int numberOfDeclarerPlusSkatWithTwoBuben = 0;
		int numberOfSplitOneOneBuben = 0;
		int counter = 0;
		int max = 1000000;
		while (counter < max) {
			counter++;
			Board board = boardDealer.dealBoard(new ShuffledDeck());
			if (board.hasTwoBubenOnHandOnePlusSkat()) {
				numberOfDeclarerPlusSkatWithTwoBuben++;
				if (board.bubenSplitOneOneInDefenders()) {
					numberOfSplitOneOneBuben++;
				}
			}
			// System.out.println(board);
		}
		
		System.out.println("Total de mãos:" + counter);
		System.out.println("Total de mãos com mão 1 + skat com 2 buben: " + numberOfDeclarerPlusSkatWithTwoBuben);
		System.out.println("Total de mãos com mão 1 + skat com 2 buben e buben divididos 1 a 1 nas mãos 2 e 3 : "
				+ numberOfSplitOneOneBuben);
		System.out.println("Razão: " + (double) numberOfSplitOneOneBuben / numberOfDeclarerPlusSkatWithTwoBuben);
	}

}
