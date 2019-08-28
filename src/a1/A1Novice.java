package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// number of customers (first integer)
		int numCustomers = scan.nextInt();
		
		// loop through all customers
		for (int i = 0; i < numCustomers; i++) {
			// first collect customer name (formatting in print statement)
			String first = scan.next();
			String last = scan.next();

			// next input should be number of products for for that customer
			int numItems = scan.nextInt();

			// declare customer sum outside for loop so it is accessible for print statement
			double customerSum = 0;
			
			// loop through customer products using the numItem that was scanned previously
			for (int j = 0; j < numItems; j++) {
				// first number is an integer that represents product quantity
				int numProduct = scan.nextInt();
				// scan product name so the scanner is up to date with the input
				String productName = scan.next();
				// second number is price of the product
				double productPrice = scan.nextDouble();
				// add the total cost of that product to the customer's total and continue loop
				customerSum += (numProduct * productPrice);
			}
			// convert customer sum to string formatting in order to print
			String custSumString = String.format("%.2f", customerSum);
			
			// combine and format elements to print
			System.out.println(first.charAt(0) + ". " + last + ": " + custSumString);
			
			
		}
		// all input has been processed to scanner can close
		scan.close();
		
	}
}
