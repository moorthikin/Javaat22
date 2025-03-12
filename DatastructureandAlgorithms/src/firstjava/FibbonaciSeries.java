package firstjava;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		
	// Fibonacci series up to n numbers
		
   /* 
    * Fibonacci series is like that 0,1,1,2,3,5,8,13,21,34
    * For the Fibonacci series firstNumber is 0 and 1 
    * then we need to sum the first two numbers up to n numbers
    */
		
    int firstTerm = 0;
    int secondTerm = 1;
    
    Scanner in = new Scanner(System.in);
    int num = in.nextInt() ;
    
    
    for(int i = 1; i<= num; i++ ) {
      System.out.print(" " + firstTerm);
       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
    }
	}
}
