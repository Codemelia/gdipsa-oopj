package access_modifiers.protected_2;

public class MyPositiveNumber extends MyNumber {
	// setter getter for positive value
	public void setPositiveValue(int n) { if (n > 0) setValue(n); }
	public int getPositiveValue() { return getValue(); }
}
