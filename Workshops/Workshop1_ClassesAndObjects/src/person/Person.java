package person;
public class Person {
	
	// static variables
	/*
	private String name;
	private int age;
	private String gender;
	private double height;
	 */
	
	private String name;
	private int age;
	private char gender;
	private String job;
	private int currYear;
	private int yob;
	
	// getter setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender = gender; }
	public String getJob() { return job; }
	public void setJob(String job) { this.job = job; }
	public int getCurrYear() { return currYear; }
	public void setCurrYear(int currYear) { this.currYear = currYear; }
	public int getYoB() { return yob; }
	public void setYoB(int yob) { 
		this.yob = yob;
		this.age = this.currYear - yob; // set age here
	}
	
	// constructors
	public Person() {}
	public Person(String name, int yob, int currYear, char gender, String job) {
		this.name = name;
		this.yob = yob;
		this.currYear = currYear;
		this.age = currYear - yob; // curr year - yob = curr age
		this.gender = gender;
		this.job = job;
	}
	
	// static print
	/*
	public void intro() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + height + "meters tall");
		System.out.println("I am " + age + "years old");
		System.out.println("Gender: " + gender);
	}
	 */
	
	// dynamic print
	// female / no gen / age = 0 - no age display
	public void intro() {
		if (gender == 'F' || gender == 'N' || age == 0) {
			System.out.printf(
				"%s, %s, %s.%n", 
				name, String.valueOf(gender), job);
		} else {
			System.out.printf(
				"%s, %d, %s, %s.%n", 
				name, age, String.valueOf(gender), job);
		}
	}

}
