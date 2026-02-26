package led;

public class LED_Lamp {
	
	private LED red = new LED("red");
	private LED green = new LED("green");
	private LED blue = new LED("blue");
	
	public LED_Lamp() {}
	
	public boolean showLight(int lightIdx) {
		
		// check and turn off all lights when called
		red.turnOff();
		green.turnOff();
		blue.turnOff();
		
		// print and return based on idx
		switch (lightIdx) {
			case 0:
				red.turnOn();
				System.out.printf(">>> Light is now %s%n", red.getColor());
				return true;
			case 1:
				green.turnOn();
				System.out.printf(">>> Light is now %s%n", green.getColor());
				return true;
			case 2:
				blue.turnOn();
				System.out.printf(">>> Light is now %s%n", blue.getColor());
				return true;
			default:
				System.out.println(">>> Error! Expects 0, 1, or 2.");
				return false;
		}
	}
	
}
