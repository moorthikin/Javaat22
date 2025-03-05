package firstjava;

import java.util.Scanner;

public class CurrencyConverter {
	
	
	/*
	 * based on the daily rate!
	 */
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Amount : " );
	float inr = in.nextFloat();
	float usd = inr/87;	
	System.out.println("The Indian Rupees " + inr + "is eqaul to $" + usd);
	
}
}
