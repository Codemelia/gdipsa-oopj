package classesandobjects;

public class Referencing {

	public static void main(String[] args) {
		
		// assign values to diff references
		Instantiation in1 = new Instantiation("title1", "date1");
		Instantiation in2 = new Instantiation("title2", "date2");
		
		// print out original reference
		System.out.println(in1.toString());
		System.out.println(in2.toString());
		
		// output:
		/*
		 * Title: title1 | Date: date1
		 * Title: title2 | Date: date2
		 */
		
		// reassigning reference variables
		in1 = in2;
		
		// print out new reference
		System.out.println(in1.toString());
		System.out.println(in2.toString());
		
		// in1 and in2 are now aliases (pointing to same object)
		// output:
		/*
		 * Title: title2 | Date: date2
		 * Title: title2 | Date: date2
		 */
		
		// change object's state through one reference
		in1.setTitle("newtitle");
		
		// print out new reference
		System.out.println(in1.toString());
		System.out.println(in2.toString());
		
		// changing the object's state through one reference changes it for all aliases
		// output:
		/*
		 * Title: newtitle | Date: date2
		 * Title: newtitle | Date: date2
		 */
		
		// in1's original object is no longer stored in memory as there are no more references to it
		// if there are remaining aliases for in1's original object, it will remain in memory
		
		// the same concept applies to variables:
		int num1 = 5;
		int num2 = 12;
		
		System.out.printf("Num1: %d | Num2: %d%n", num1, num2);
		
		// output:
		/*
		 * Num1: 5 | Num2: 12
		 */

		num2 = num1;
		
		System.out.printf("Num1: %d | Num2: %d%n", num1, num2);
		
		// output:
		/*
		 * Num1: 5 | Num2:
		 */
		
	}

}
