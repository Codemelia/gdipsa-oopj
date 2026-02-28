package inheritance_p2.main;

import inheritance_p2.child.*;
import inheritance_p2.parent.Employee;

public class Main {

	public static void main(String[] args) {
		
		// create commission employee obj
		// contract - no salary, > 3000 sales - 10% commission else 5%
		CommissionEmployee fred = new CommissionEmployee(
			"Fred", "CT0000111A", 3108.23);
		
		// create base+commission employee obj
		// full-time - 2000 base salary, > 5000 sales - 20% commission else 15%
		BasePlusCommissionEmployee may = new BasePlusCommissionEmployee(
			"May", "FT1111222B", 5839.06);
		
		// create hourly rate employee obj
		// part-time - varied hourly rate, no commission, no sales, no salary
		HourlyEmployee ian = new HourlyEmployee(
			"Ian", "PT2222333C", 12, 120);

		// print payroll with calculated earnings
		System.out.println("====== Employee Payroll ======");
		fred.printPayroll();
		may.printPayroll();
		ian.printPayroll();
		
	}

}
