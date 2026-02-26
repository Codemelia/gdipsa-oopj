package led;

public class LED {

	private boolean isOn;
	public String color;
	
	public LED(String color) {
		isOn = false;
		this.color = color;
	}
	
	public String getColor() { return color; }
	
	public boolean isLEDOn() { return isOn; }
	public void turnOn() { if (!isLEDOn()) isOn = true; }
	public void turnOff() { if (isLEDOn()) isOn = false; }
	
}