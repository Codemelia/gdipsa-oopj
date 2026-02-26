package led;
import java.util.Scanner;

public class Main {
	
	private final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		// class example
		/*
		LED redLED = new LED("red"); // instantiate lamp with red colour
		System.out.println("LED Colour: " + redLED.getColor()); // get curr colour
		redLED.turnOn(); // turn on
		System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF")); // print on if on, off if off
		redLED.turnOff(); // turn off
		System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF")); // print on if on, off if off
		*/
		
		LED_Lamp lamp = new LED_Lamp();
		
		// static code
		/*
		lamp.showLight(0);
		lamp.showLight(1);
		lamp.showLight(2);
		lamp.showLight(3);
		lamp.showLight(0);
		*/
		
		// dynamic code
		// take in user inputs
		System.out.println(">>> What light do you want to turn on?");
		System.out.println("1. Red\n2. Green\n3. Blue");
		
		// error flag
		boolean cont = true;
		
		do {
			
			String idxStr = in.nextLine().trim();
			if (idxStr.equals("exit")) cont = false; // exit loop
			
			else {
				try {
					int idx = Integer.parseInt(idxStr);
					lamp.showLight(idx - 1); // -1 to match index
					
					System.out.println(">>> Turn on another light or type \"exit\" to exit the program.");				
				} catch (NumberFormatException e) {
					System.out.println(">>> Invalid input. Please select one provided option."); // reloops
				}
			}
			
		} while (cont);
		
		// close scanner
		in.close();

	}

}
