package object_inheritance;

public class TestUtil {

	// print info
	public static void print(Account acc) {
		System.out.println("\n\t\tAccount Information");
		System.out.println("---------------------------------------------------");
		System.out.println(acc);
	}
	
	// verify success of withdraw/deposit
	public static void verifyDeposit(boolean depSuccess) {
		if (depSuccess) System.out.println(">>> Deposit successful.");
		else System.out.println(">>> Deposit amount is invalid. Please try again.");
		
	}
	
	public static void verifyWithdrawal(boolean withSuccess) {
		if (withSuccess) System.out.println(">>> Withdrawal successful.");
		else System.out.println(">>> Withdrawal amount is invalid. Please try again.");
		
	}
	
	public static void verifyInterest(boolean intSuccess) {
		if (intSuccess) System.out.println(">>> Interest credit successful.");
		else System.out.println(">>> Balance amount not valid for interest credit.");
	}
	
}
