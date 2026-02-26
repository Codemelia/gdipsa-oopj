package access_modifiers;

public class Main {

	public static void main(String[] args) {
	
		// 5. test PositiveNumber class
		PositiveNumber pn = new PositiveNumber(10);
		
		int[] arr = { 20, -1, 2 };
		
		for (int i = 0; i < arr.length; i++) {
			if (pn.setN(arr[i])) System.out.printf("Update successful. N is now %d.%n", pn.getN());
			else System.out.printf("Update failed. N is still %d.%n", pn.getN());
		}
		
	}

}
