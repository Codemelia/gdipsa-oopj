package access_modifiers.parent;

public class MyParent {

	protected int x, y;
	
	// constructor
	public MyParent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected int getX() { return x; }
	protected int getY() { return y; }
	
}
