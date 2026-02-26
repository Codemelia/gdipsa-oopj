package object_inheritance;

import static object_inheritance.TestUtil.*;

public class Test {
	public static void main(String[] args) {
		
		// -- PART 1. Account Class -- //
		testAccount();
		
		// -- PART2. Inheritance -- //
		testSavingsAccount();
		testCurrentAccount();
		testOverdraftAccount();
		
	}
	
	public static void testAccount() {
		// Test class Account by creating an Account object
		// and call methods to make sure your code at
		// class Account works.
		System.out.println("===== Testing Account =====");
		
		// TODO: Create objects
		// 1. Create a new Account object myAccount.
		// - number: S0000111
		// - holderId: S1111111A
		// - balance: 2000
		Account myAccount = new Account("S0000111", "S1111111A", 2000);
		
		// 2. Call System.out.println(myAccount)
		// Make sure that the account information
		// is displayed correctly.
		print(myAccount);
		
		// TODO: deposit
		// Deposit 200 to the myAccount.
		// Display the account information again and
		// manually verify the new balance.
		verifyDeposit(myAccount.deposit(200));
		print(myAccount);
		
		// TODO: withdraw
		// Withdraw 200 from the myAccount.
		// Display the account information again and
		// manually verify the new balance.
		verifyWithdrawal(myAccount.withdraw(200));
		print(myAccount);
		
		// TODO: withdraw
		// Withdraw 4000 from the myAccount.
		// Make sure that the withdrawing is unsuccessful.
		// You are encouraged to add more test cases.
		verifyWithdrawal(myAccount.withdraw(4000));
		print(myAccount);
		
		// EXTRA TEST CASES
		// negative deposit
		verifyDeposit(myAccount.deposit(-400));
		print(myAccount);
		
		// negative withdrawal
		verifyWithdrawal(myAccount.withdraw(-500));
		print(myAccount);
	}
	
	public static void testSavingsAccount() {
		// new savings acc obj
		SavingsAccount savAccount = new SavingsAccount("S0000222", "S1111111B", 1500);
		print(savAccount);
		
		// savings account interest credit
		verifyInterest(savAccount.creditInterest());
		print(savAccount);
		
		// EXTRA TEST CASES
		// negative bal on savings acc
		savAccount.setBalance(-2000);
		verifyInterest(savAccount.creditInterest());
		print(savAccount);
	}
	
	public static void testCurrentAccount() {
		// new current acc obj
		CurrentAccount currAccount = new CurrentAccount("C0000111", "C1111111A", 3000);
		print(currAccount);
		
		// current account interest credit
		verifyInterest(currAccount.creditInterest());
		print(currAccount);
		
		// EXTRA TEST CASES
		
		// negative bal on current acc
		currAccount.setBalance(-1500);
		verifyInterest(currAccount.creditInterest());
		print(currAccount);
	}
	
	public static void testOverdraftAccount() {
		// new overdraft acc obj
		OverdraftAccount overAccount = new OverdraftAccount("O0000111", "O1111111A", -400);
		print(overAccount);
		
		// overdraft account interest credit
		verifyInterest(overAccount.creditInterest());
		print(overAccount);
		
		// EXTRA TEST CASES
		// negative bal on overdraft acc
		overAccount.setBalance(-3500);
		verifyInterest(overAccount.creditInterest());
		print(overAccount);
	}
	
}
