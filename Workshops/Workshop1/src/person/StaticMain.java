package person;
import java.time.LocalDate;

public class StaticMain {

	public static void main(String[] args) {
		
		// insert curr year
		int currYear = LocalDate.now().getYear();
		
		Person john = new Person("John", 2004, currYear, 'M', "Teacher");
		Person fred = new Person("Fred", 2003, currYear, 'M', "Researcher");
		Person mary = new Person("Mary", 1999, currYear, 'F', "Doctor");
		Person sue = new Person("Sue", 1982, currYear, 'F', "Nurse");
		
		john.intro();
		fred.intro();
		mary.intro();
		sue.intro();
		
		System.out.println(); // newline
		
		// composition - party icebreaker
		Party party = new Party(john, fred, mary, sue);
		party.icebreak();
		
	}

}
