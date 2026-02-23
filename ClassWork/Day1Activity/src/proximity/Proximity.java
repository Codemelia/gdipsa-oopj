package proximity;

public class Proximity {
	
	// instance var
	private String name = "Proximity";
	
	public void method1() {
		// local var
		// local var overshadows instance var with same name
		String name = "method1";
		
		// using local var
		System.out.println("name = " + name);
	}
	
	public void method2() {
		// using instance var
		System.out.println("name = " + name);
	}
	
}
