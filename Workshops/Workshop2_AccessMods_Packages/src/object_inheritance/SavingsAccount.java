package object_inheritance;

public class SavingsAccount extends Account {
		
	public SavingsAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}

	// override calc interest method
	// Math.abs(balance) to ensure pos/neg doesn't affect calc
	@Override
	public double calculateInterest() {
		if (getBalance() < 0) return 0; // handles case of neg balance
		return getBalance() * 0.01; 
	}

}
