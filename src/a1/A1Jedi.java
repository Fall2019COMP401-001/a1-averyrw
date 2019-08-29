package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// first integer is number of products
		int numProducts = scan.nextInt();
		
		// create string array to hold product names
		String[] productNames = new String[numProducts];
		
		// create int array to hold quantities of products
		int[] productQuant = new int[numProducts];
		
		// create int array to hold number of customers who purchased each product
		int[] numCustomersBought = new int[numProducts];
		
		// loop to fill name array
		for (int i = 0; i < numProducts; i++) {
			// scan through the strings and add names to array
			productNames[i] = scan.next();
			// prices are unnecessary, but scan to keep scanner caught up
			double productPrice = scan.nextDouble();
		}
		
		// next int is number of customers
		int numCustomers = scan.nextInt();
		
		// loop through customers orders
		for (int i = 0; i < numCustomers; i++) {
			// scan names to keep scanner up to date;
			String first = scan.next();
			String last = scan.next();
			
			// next int is number of different items bought by customer
			int numCustProducts = scan.nextInt();
			
			// create an array to hold the product names that the customer bought
			String[] custProducts = new String[numCustProducts];
			
			// loop through to update quantity array
			for (int j = 0; j < numCustProducts; j++) {
				// create variable to hold quantity (next integer)
				int currentQuant = scan.nextInt();
				// scan next string to get product name and add to product array
				String currentName = scan.next();
				custProducts[j] = currentName;
				
				// loop through product array to match product and update quantity
				for (int b = 0; b < productNames.length; b++) {
					if (currentName.equals(productNames[b])) {
						// update the quantity array and the corresponding index of number of customers who bought that item
						productQuant[b] += currentQuant;
						break;
					}
				}
			}
			
			// now that custProducts is full, loop through store products and update numCustomersBrought
			for (int j = 0; j < productNames.length; j++) {
				// create variable to hold name of current product
				String checkProduct = productNames[j];
				// loop through customer products to see if current product is contained
				for (int b = 0; b < custProducts.length; b++) {
					if (custProducts[b].equals(checkProduct)) {
						numCustomersBought[j] += 1;
						break;
					}
				}
			}
		}
		
		// loop through product name & quant arrays and print output
		for (int i = 0; i < productNames.length; i++) {
			if (numCustomersBought[i] == 0) {
				System.out.println("No customers bought " + productNames[i]);
			} else {
				System.out.println(numCustomersBought[i] + " customers bought " + productQuant[i] + " " + productNames[i]);
			}
		}
		
	}
}
