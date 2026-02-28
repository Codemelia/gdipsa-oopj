package inheritance;

public class MyChild extends MyParent {
	
	public MyChild(int x, int y) {
		// super calls parent's constructor
		super(x, y);
	}
	
	public int getXPlusY() {
		// accessing protected methods of parent
		return x + y;
	}
	
}
