package classes;

public class Main {

	public static void main(String[] args) {
		
		// new default student
		Student def = new Student();
		
		// student with custom values
		Student cust = new Student(
			"4B", "Jess", 11, 'F', 
			new String[] { "Math", "Science", "English", "Geography" }
		);
		
		// print out students
		System.out.println(def.intro());
		System.out.println(cust.intro());

	}

}
