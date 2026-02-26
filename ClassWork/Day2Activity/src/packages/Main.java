package packages;

public class Main {

	public static void main(String[] args) {
		MyDecorator d = new MyDecorator();
		String s = d.decorate("Hellow World!");
		System.out.println(s);
	}

}
