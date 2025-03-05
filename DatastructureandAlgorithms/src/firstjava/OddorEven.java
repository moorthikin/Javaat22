package firstjava;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		
		if(num1 % 2 == 0 ) {
			
			System.out.println("The given number is Even number!");
		}
		else {
			System.out.println("The given number is odd number!");
		}
	}
}
