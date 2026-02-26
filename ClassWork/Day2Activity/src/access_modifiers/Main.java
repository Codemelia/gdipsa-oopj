package access_modifiers;

import access_modifiers.child.MyChild;

public class Main {

	public static void main(String[] args) {
		
		// -- public -- //
		// generate new object of MyClass with count of 10
		MyClass mc = new MyClass(10);
		
		// read object's attribute (count)
		// accessible bc both variable and method are public
		System.out.printf("Count via count variable: %d | Count via getCount() method: %d%n", 
			mc.count, mc.getCount());
		
		// -- private -- //
		// main is unable to read private String status
		// access it via public getStatus() method
		System.out.printf("Status: %s | Count: %d%n", mc.getStatus(), mc.count);
		
		// increment count
		++mc.count;
		
		// use public setStatus() method to modify private String status
		mc.setStatus("Updated");
		System.out.printf("Status: %s | Count: %d%n", mc.getStatus(), mc.count);
		
		// use public resetAll() to call private reset()
		mc.resetAll();
		System.out.printf("Status: %s | Count: %d%n", mc.getStatus(), mc.count);
		
		// -- protected --//
		MyChild c = new MyChild(1, 2);
		System.out.println("Sum = " + c.getXPlusY());
		
	}
	
}
