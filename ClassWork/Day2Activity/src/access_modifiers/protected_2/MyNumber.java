package access_modifiers.protected_2;

public class MyNumber {
	private int n; // subclasses cannot access
	protected void setValue(int n) { this.n = n; } // only subclasses can access
	protected int getValue() { return n; } // only subclasses can access
}
