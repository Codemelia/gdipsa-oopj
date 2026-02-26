package access_modifiers;

public class PositiveNumber {

	// 1. private int
	private int n;
	
	// 2. getter and setter
	public boolean setN(int n) { 
		if (n < 0) return false; // 3. if input is negative value, don't update
		this.n = n;
		return true; // 4. returns true if updated; false otherwise
	}
	public int getN() { return n; }
	
	// constructor
	public PositiveNumber(int n ) {
		setN(n);
		print();
	}
	
	// print on initiate
	public void print() {
		System.out.printf("Initiation successful. N is %d.%n", getN());
	}
	
}
