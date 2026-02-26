package access_modifiers;

public class MyClass {

	// -- public modifier -- //
	// variable with public modifier
	public int count;
	public MyClass(int count) {  // constructor must be public as it is called on instantiation
		this.count = count;
		this.status = "Instantiated";
	}
	public int getCount() { return count; }
	public void setCount(int count) { this.count = count; }
	
	// -- private modifier --//
	private String status;
	private void reset() {
		this.count = 0;
		this.status = "Reset";
	}
	
	// allows public access to private variable
	public String getStatus() { return this.status; } 
	public void setStatus(String status) { this.status = status; }
	public void resetAll() { reset(); }
	

}
