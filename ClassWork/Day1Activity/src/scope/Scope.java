package scope;

public class Scope {

	// instance var
	// instance var is available to all method of class
	private String name = "Scope";
	
	public void method1() {
		// local var
		int x = 10;
		
		// x is only visible to method 1
		System.out.println("x = " + x);	
		
		// name is visible to method 2
		System.out.println("name = " + name);
	}
	
	public void method2() {
		// local var
		int y = 20;
		
		// y is only visible to method2
		System.out.println("y = " + y);
		
		// name is visible to method 2
		System.out.println("name = " + name);
	}
	
}
