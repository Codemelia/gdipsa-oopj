package object_inheritance.models;

public class OverdraftAccount extends Account {
	
	public OverdraftAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}

	// override calc interest method
	// Math.abs(balance) to ensure pos/neg doesn't affect calc
	@Override
	public double calculateInterest() {
		if (getBalance() < 0) return Math.abs(getBalance()) * -0.06; // handles case of neg balance
		return getBalance() * 0.0025; 
	}
	
}
