package core;

public enum Suit {
	KARO("Karo", "d"), KREUZ("Kreuz", "c"), HERZ("Herz", "h"), PIK("Pik", "s");

	private final String name;
	private final String symbol;

	private Suit(String name, String symbol) {
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
