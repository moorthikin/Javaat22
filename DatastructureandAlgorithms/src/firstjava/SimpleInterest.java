package firstjava;

import java.util.Scanner;

public class SimpleInterest {
	
/*
 *  SI = PTR
 *  P - principle amount
 *  T - Time in years 
 *  R - Rate of Interest 
 */
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	float principle = in.nextFloat();
	float rate = in.nextFloat();
	float time = in.nextFloat();

   float ans = principle*rate*time / 100;

System.out.println("Simple Interest for the "+ principle+ " amount is :" + ans);
}
}
