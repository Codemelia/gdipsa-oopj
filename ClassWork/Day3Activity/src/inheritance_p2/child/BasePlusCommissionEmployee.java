package inheritance_p2.child;

import inheritance_p2.parent.Employee;

public class BasePlusCommissionEmployee extends Employee {
	
	private double salary;
	private double grossSales;
	
	// getter setter
	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }
	
	public double getGrossSales() { return grossSales; }
	public void setGrossSales(double grossSales) { this.grossSales = grossSales; }
	
	// constructor
	public BasePlusCommissionEmployee(String name, String identityNumber, double grossSales) {
		super(name, identityNumber);
		this.salary = 2000; // set base salary 2000
		this.grossSales = grossSales;
	}
	
	// override parent earnings()
	@Override
	public double earnings() {
		// set commission rate to 20% if sales > 5000, else set to 15%%
		double commissionRate = grossSales > 5000 ? 0.20 : 0.15;
		return salary + commissionRate * grossSales;
	}
	
}
