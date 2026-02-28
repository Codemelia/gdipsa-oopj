package inheritance_p2.parent;

// abstract class = cannot be instantiated, can only be used as blueprint
public abstract class Employee {

	private String name; // defaults to null
	private String identityNumber; // defaults to null
	
	// getters setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getIdentityNumber() { return identityNumber; }
	public void setIdentityNumber(String identityNumber) { this.identityNumber = identityNumber; }
	
	// empty constructor
	public Employee() {}
	
	// constructor with fixed variables
	// other variables vary by employee role and will be instantiated in child classes
	public Employee(String name, String identityNumber) {
		this.name = name;
		this.identityNumber = identityNumber;
	}
	
	// forces child classes to define
	public abstract double earnings();
	
	// shared print method
    public void printPayroll() {
    	String className = getClass().getSimpleName(); // get name of child classes
        System.out.printf("""
            -------------------------
            Type: %s
            Name: %s
            ID: %s
            Earnings: %,.2f%n""",
            className.equals("CommissionEmployee") ? "Contract" : // employee type according to child class name
            className.equals("HourlyEmployee") ? "Part Time" :
            "Full Time",
            name,
            identityNumber,
            earnings());
    }
	
}
