package object_inheritance.models;

public class SavingsAccount extends Account {
		
	public SavingsAccount(String number, String holderId, double balance) {
		super(number, holderId, balance);
	}

	// override calc interest method
	@Override
	public double calculateInterest() {
		if (getBalance() < 0) return 0; // handles case of neg balance
		return getBalance() * 0.01; 
	}

}
