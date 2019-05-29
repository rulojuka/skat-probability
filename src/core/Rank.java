package core;

public enum Rank {
	SIEBEN("Sieben", "7"), ACHT("Acht", "8"), NEUN("Neun", "9"), ZEHN("Zehn", "T"), BUBE("Bube", "B"),
	DAME("Dame", "D"), KONIG("Konig", "K"), ASS("Ass", "A");

	private final String name;
	private final String symbol;

	private Rank(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return this.name;
	}

	public String getSymbol() {
		return this.symbol;
	}
}
