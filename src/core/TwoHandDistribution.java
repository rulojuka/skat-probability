package core;

public class TwoHandDistribution {
	private int[] amount = new int[20];
	private int total;
	
	public TwoHandDistribution() {
		for(int i =0; i<amount.length; i++) {
			amount[i]=0;
		}
		total = 0;
	}
	
	public void addOneTo(int lesser) {
		this.amount[lesser]++;
		total++;
	}
	
	public int get(int lesser) {
		return this.amount[lesser];
	}
	
	public int getTotal() {
		return this.total;
	}

}
