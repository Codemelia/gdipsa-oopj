package person;

public class Party {

	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	
	public Party(Person p1, Person p2, Person p3, Person p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	/*
	public void icebreak() {
		System.out.println("Ice-breaking time!");
		p1.intro();
		p2.intro();
		p3.intro();
		p4.intro();
	}
	*/
	
	// custom greeting msgs
	public void icebreak() {
		System.out.println("Ice-breaking time!");
		System.out.printf("Hello, I'm %s! I am %d years old, and I am %s. I am a %s.%n",
			p1.getName(), p1.getAge(), stringifyGender(p1.getGender()), p1.getJob());
		System.out.printf("Hello, I'm %s! I am %d years old, and I am %s. I am a %s.%n",
			p2.getName(), p2.getAge(), stringifyGender(p2.getGender()), p2.getJob());
		System.out.printf("Hello, I'm %s! I am %d years old, and I am %s. I am a %s.%n",
			p3	.getName(), p3.getAge(), stringifyGender(p3.getGender()), p3.getJob());
		System.out.printf("Hello, I'm %s! I am %d years old, and I am %s. I am a %s.%n",
			p4.getName(), p4.getAge(), stringifyGender(p4.getGender()), p4.getJob());
	}
	
	// helper to conv gender back to string
	public String stringifyGender(char gender) {
		if (gender == 'M') return "male";
		else return "female";
	}
	
}
