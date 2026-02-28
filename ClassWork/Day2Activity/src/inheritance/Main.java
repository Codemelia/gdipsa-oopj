package inheritance;

public class Main {

	public static void main(String[] args) {
		// creating a MyChild object
		MyChild c = new MyChild(1, 2);
		
		// calling inherited methods
		System.out.println("Calling inherited methods.");
		System.out.println("x = " + c.x);
		System.out.println("y = " + c.y);
		
		// calling its own method
		System.out.println("\nCalling own method.");
		System.out.println("z = " + c.getXPlusY());
	}

}
