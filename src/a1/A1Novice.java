package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// number of customers (first integer)
		int numCustomers = scan.nextInt();
		
		for (int i = 0; i < numCustomers; i++) {
			String first = scan.next();
			// System.out.println(first.charAt(0));
			String last = scan.next();
			// System.out.println(last);
			int numItems = scan.nextInt();
			// System.out.println(numItems);
			double customerSum = 0;
			for (int j = 0; j < numItems; j++) {
				int numProduct = scan.nextInt();
				String productName = scan.next();
				double productPrice = scan.nextDouble();
				customerSum += (numProduct * productPrice);
			// System.out.println(String.format("%.2f", customerSum));
			}
			String custSumString = String.format("%.2f", customerSum);
			System.out.println(first.charAt(0) + ". " + last + ": " + custSumString);
			
			
		}
		
		scan.close();
		
	}
}
