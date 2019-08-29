

package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numProducts = scan.nextInt();
		
		// create an array of products and an array for their prices
		String[] productNames = new String[numProducts];
		double[] productPrices = new double[numProducts];
		
		// fill in those arrays
		for (int i = 0; i < numProducts; i++) {
			productNames[i] = scan.next();
			productPrices[i] = scan.nextDouble();
		}
		
		// number of customers will be the next integer
		int numCustomers = scan.nextInt();
		
		// create array to keep track of customer names in order
		String[] names = new String[numCustomers];
		
		// create array to keep track of customer totals in order to calculate biggest spender/average
		double[] totals = new double[numCustomers];
		
		// loop through all customers
		for (int i = 0; i < numCustomers; i++) {
			// first collect customer name
			String first = scan.next();
			String last = scan.next();
			String fullName = first + " " + last;
			
			// put name into array
			names[i] = fullName;

			// next input should be number of products for for that customer
			int numItems = scan.nextInt();

			// declare customer sum outside for loop so it is accessible outside
			double customerSum = 0;
			
			// loop through customer products using the numItem that was scanned previously
			for (int j = 0; j < numItems; j++) {
				// scan to find the name of the product and set up a variable to hold its cost
				int numProduct = scan.nextInt();
				String currentProduct = scan.next();
				double productPrice = 0;
				
				// need to match it to one of the store products in order to find a price
				for (int b = 0; b < productNames.length; b++) {
					if (currentProduct.equals(productNames[b])) {
						productPrice = productPrices[b];
						b = productNames.length;
					}
				}
				// find quantity of that product
				
				// add the total cost of that product to the customer's total and continue loop
				customerSum += (numProduct * productPrice);
			}
			
			
			
			// add customers sum into appropriate index in totals array
			totals[i] = customerSum;
			
			// combine and format elements to print
			// System.out.println(first.charAt(0) + ". " + last + ": " + custSumString);
			
			
		}
		
		System.out.println(biggestSpender(totals, names));
		System.out.println(smallestSpender(totals, names));
		System.out.println(average(totals));
		
		// all input has been processed to scanner can close
		scan.close();
		
	}
	
	public static String biggestSpender(double[] totals, String[] names) {
		// loop to find biggest spender
		// declare high and highIndex outside so they only change when necessary
				
		double high = totals[0];
		int highIndex = 0;
				
		// start i at 1 because there is no need to compare customer 0 to themself
				
		for (int i = 1; i < totals.length; i++) {
				if (totals[i] > high) {
					high = totals[i];
					highIndex = i;
				}
		}
		
		String highTotalString = String.format("%.2f", high);
		
		return "Biggest: " + names[highIndex] + " (" + highTotalString + ")";
	}
	
	public static String smallestSpender(double[] totals, String[] names) {
		// loop to find biggest spender
		// declare high and highIndex outside so they only change when necessary
				
		double low = totals[0];
		int lowIndex = 0;
				
		// start i at 1 because there is no need to compare customer 0 to themself
				
		for (int i = 1; i < totals.length; i++) {
				if (totals[i] < low) {
					low = totals[i];
					lowIndex = i;
				}
		}
		
		String lowTotalString = String.format("%.2f", low);
		
		return "Smallest: " + names[lowIndex] + " (" + lowTotalString + ")";
	}
	
	public static String average(double[] totals) {
		// loop to find the sum of all the totals
		// declare high and highIndex outside so they only change when necessary
				
		double sum = 0;
						
		for (int i = 0; i < totals.length; i++) {
				sum += totals[i];
		}
		
		double average = sum / totals.length;
		
		String averageString = String.format("%.2f", average);
		
		return "Average: " + averageString;
	}
}
