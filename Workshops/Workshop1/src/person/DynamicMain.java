package person;
import java.util.Scanner;
import java.time.LocalDate;

public class DynamicMain {
	
	final static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		// insert curr year
		int currYear = LocalDate.now().getYear();
		
		// initiate person object
		Person user = new Person();
		
		// take in user input
		System.out.println(">>> Hi user, please enter your details. ");
		
		System.out.println(">>> Name: ");
		String name = in.nextLine().trim();
		
		boolean isYoBValid = false; // error flag
		int yob = 0; // accessible outside of loop
		
		do {
			System.out.println(">>> Year of Birth: ");
			String yobStr = in.nextLine().trim();
			
			try {
				yob = Integer.parseInt(yobStr);
				if (yob > 1900 && yob < currYear) isYoBValid = true; // validate
			} catch (Exception e) { isYoBValid = false; }
			
			if (!isYoBValid) System.out.println(">>> Invalid Year of Birth. Please try again");
		} while (!isYoBValid);
		
		boolean isGenderValid = false; // error flag
		char gender; // accessible outside of loop
		
		do {
			System.out.println(">>> Gender: ");
			String genderStr = in.nextLine().trim().toLowerCase();
			
			gender = charGender(genderStr); // conv gender string to char
			
			if (gender == 'F' || gender == 'M') {
				isGenderValid = true;
			} else {
				System.out.println(">>> Invalid Gender. Please try again. ");
			}
			
		} while (!isGenderValid);
		
		System.out.println(">>> Job Title: ");
		String job = in.nextLine();
		
		// insert values to user object
		user.setCurrYear(currYear);
		user.setName(name);
		user.setYoB(yob);
		user.setGender(gender);
		user.setJob(job);
		
		// print
		user.intro();
		
		// close scanner
		in.close();
		
	}
	
	// helper
	public static char charGender(String genderStr) {
		// validate char
		if (genderStr.equals("female") || genderStr.equals("f")) {
			return 'F';
		} else if (genderStr.equals("male") || genderStr.equals("m")) {
			return 'M';
		} else {
			return 'N'; // neutral
		}
	}

}
