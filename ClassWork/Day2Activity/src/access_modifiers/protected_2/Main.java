package access_modifiers.protected_2;

public class Main {

	public static void main(String[] args) {
		MyPositiveNumber mpn = new MyPositiveNumber();
		System.out.println("Setting value to 10.");
		
		// setting the value of the attribute "n"
		// from the subclass MyPositiveNumber
		mpn.setPositiveValue(10);
		System.out.println("Setting value to -10.");
		
		// note this would be filtered off by the
		// if-statememt in the method "setPositiveValue"
		mpn.setPositiveValue(-10);
		// mpn.setValue(-10);
		System.out.println("Retrieving value...");
		
		// can only call the public method of MyPositiveNumber
		// to get the value of the private attribute "n" of MyNumber
		System.out.printf("Value: %d.\n", mpn.getPositiveValue());
	}

}
