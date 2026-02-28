package inheritance_p2.child;

import inheritance_p2.parent.Employee;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	
	// getter setter
	public double getGrossSales() { return grossSales; }
	public void setGrossSales(double grossSales) { this.grossSales = grossSales; }
	
	// constructor
	public CommissionEmployee(String name, String identityNumber, double grossSales) {
		super(name, identityNumber);
		this.grossSales = grossSales;
	}
	
	// override parent earnings()
	@Override
	public double earnings() {
		// set commission rate to 10% if sales > 3000, else set to 5%
		double commissionRate = grossSales > 3000 ? 0.10 : 0.05;
		return commissionRate * grossSales; 
	}
	
}