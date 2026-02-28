package inheritance_p2.child;

import inheritance_p2.parent.Employee;

public class HourlyEmployee extends Employee {
	
	private double hourlyRate;
	private double hoursWorked;
	
	// getter setter
	public double getHourlyRate() { return hourlyRate; }
	public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
	
	public double getHoursWorked() { return hoursWorked; }
	public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
	
	// constructor
	public HourlyEmployee(String name, String identityNumber, double hourlyRate, double hoursWorked) {
		super(name, identityNumber);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	// override parent earnings()
	@Override
	public double earnings() {
		return hourlyRate * hoursWorked;
	}

}
