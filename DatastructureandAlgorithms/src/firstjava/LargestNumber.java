package firstjava;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the First Number : ");
	int num1 = in.nextInt();
	System.out.println("Enter the Second Number : ");
	int num2 = in.nextInt();
	
	int largestNumber;
	
	if(num1 > num2) {
		largestNumber = num1;
		System.out.println("The Largest number of the Given Two Numbers is : " + largestNumber);
	}
	else if (num2 > num1) {
		largestNumber = num2;
		System.out.println("The Largest number of the Given Two Numbers is : " + largestNumber);
	}
	else if (num1 == num2) {
		
		System.out.println("The Given Both Numbers are equal.");
	}
	else {
		
		System.out.println("Entered Number is invalid");
	}
	
}
}
