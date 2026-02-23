package classes;

import java.util.Arrays;

public class Student {
	
	String className;
	String name;
	int age;
	char gender;
	String genConv;
	String[] subjects;
	
	// default constructor
	public Student() {
		this.className = "3F";
		this.name = "Ben";
		this.age = 10;
		this.gender = 'M';
		this.genConv = "boy";
		this.subjects = new String[] { "Science", "Math", "English", "History" };
	}
	
	// constructor that takes in values
	public Student(String className, String name, int age,
		char gender, String[] subjects) {
		if (this.gender == 'M') this.genConv = "boy";
		else this.genConv = "girl";
		this.className = className;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.subjects = subjects;
	}
	
	// introduction
	public String intro() {
		
		if (this.gender == 'M' ) this.genConv = "boy";
		else this.genConv = "girl";
		
		return String.format("""
			Hi! My name is %s and I am from class %s.%n
			I am %d years old, and I am a %s.%n
			I am taking subjects: %s.%n
		""",
		this.name, 
		this.className, 
		this.age, 
		this.genConv, 
		Arrays.toString(this.subjects));
	
	}
	
}