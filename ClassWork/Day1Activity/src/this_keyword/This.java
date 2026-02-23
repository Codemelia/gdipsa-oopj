package this_keyword;

public class This {
	
	// instance var
	private String name = "This";
	
	public void method1() {
		// local var
		String name = "method1";
		
		// this keyword refers to the instance var instead of local var
		System.out.println("name = " + this.name);
	}
	
	public void method2() {
		// using instance var
		System.out.println("name = " + name);
	}

}
