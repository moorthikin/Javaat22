package firstjava;

import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter your first number : ");
    int num1 = in.nextInt();
    System.out.println("Enter your second number : ");
    int num2 = in.nextInt();
    System.out.println("Enter (+,-,*,/) anyone of the character : ");
    char operator = in.next().charAt(0);
    
    int ans = calculate(num1, num2, operator);
    
    System.out.println("The sum of the Given two number is " + ans);
    
}

public static int calculate(int num1 , int num2, char op) {
	
	int sum = 0;
	if (op == '+') {
		
	 sum = num1 + num2;
	 
	}
	else if (op == '-') {
		
		 sum = num1 - num2;
		 
		}
	else if (op == '*') {
		
		 sum = num1 * num2;
		 
		}
	else if (op == '/') {
		
		 sum = num1 / num2;
		 
		}
	else {
		
		System.out.println("Entered operator is not valid one!");
	}
	
	return sum;
	
}
}
