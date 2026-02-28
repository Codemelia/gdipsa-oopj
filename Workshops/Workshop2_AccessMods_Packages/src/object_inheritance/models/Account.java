package object_inheritance.models;

public class Account {
	/**
	* TODO: create attributes.
	*
	* This class has 3 attributes:
	* number : String, private.
	* holderId : String, private.
	* balance: double, private.
	*/
	private String number;
	private String holderId;
	private double balance;
	
	public Account() { }
	
	public Account(String number, String holderId, double balance) {
		/**
		* TODO: create constructor.
		*
		* This constructor receives 3 values
		* and initializes the 3 attributes accordingly.
		*/
		this.number = number;
		this.holderId = holderId;
		this.balance = balance;
	}
	
	/**
	* TODO: create getters and setters.
	* These getters and setters expose the private attributes.
	*
	* Note: number should be retrieve-only, i.e. can not be
	* set from outside.
	*/
	public void setNumber(String number) { this.number = number; }
	public String getNumber() { return number; }
	public void setHolderId(String holderId) { this.holderId = holderId; }
	public String getHolderId() { return holderId; }
	public void setBalance(double balance) { this.balance = balance; }
	public double getBalance() { return balance; }
	
	/**
	* TODO: create method display.
	*
	* This method prints out the number, holder id and balance
	* of the account.
	*/
	public void display() { System.out.printf(toString()); }
	
	/**
	* TODO: implement method deposit().
	*
	* This method increases the account balance
	* by the given amount.
	*/
	public boolean deposit(double amount) {
		if (amount <= 0) return false;
		balance += amount;
		return true;
	}
	
	/**
	* TODO: implement method withdraw().
	*
	* This method decreases the account balance
	* by the given amount. Balance must NOT be negative.
	* It makes sure that there is enough balance to
	* withdraw.
	*/
	public boolean withdraw(double amount) {
		if (amount <= 0 || balance < amount) return false;
		balance -= amount;
		return true;
	}
	
	/**
	* TODO: implement method transferTo()
	*
	* This method transfers a given amount to another given
	* account. It makes sure that this sender has enough
	* balance before transferring.
	*/
	public boolean transferTo(double amount, Account to) {
		if (balance <= 0 || balance < amount) return false;
		balance -= amount; // update self balance
		to.balance += amount; // update recipient balance
		return true;
	}
	
	/**
	* TODO: override method toString().
	*
	* This method returns the representation of the current
	* object in the form of the combination of values of
	* its attributes in a more readable format.
	*/
	@Override
	public String toString() {
		return String.format("""
			Account Number: %s
			Account Holder ID: %s
			Account Balance: %,.2f%n""", 
			number, holderId, balance);
	}
	
	// -- PART 2. INHERITANCE -- //
	public double calculateInterest() {
		return 0 * balance; // default rate to 0
	}
	
	public boolean creditInterest() {
		double interest = calculateInterest(); // default interest rate to 0
		if (interest == 0) return false; // no interest to credit
		
		setBalance(balance + interest);
		return true; // interest credited
	}
	
}
