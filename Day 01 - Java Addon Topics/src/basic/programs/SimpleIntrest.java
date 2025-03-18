package basic.programs;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		// (22/7.0) * r * r
		// Math.pi * r * r
		// 3.14 * r * r
		
		// r = 7 , res = 154 or 153.1234569
		
		
		// getting input from the User
		Scanner in = new Scanner(System.in);
		
		// Variable declaration as well as initialization
		System.out.println("Enter the Priniciple amount: ");
		int p = in.nextInt();
		System.out.println("No of months: ");
		int n = in.nextInt();
		System.out.println("Rate of intrest: ");
		int r = in.nextInt();
		
		// Process the Result
		float res = p * n * r / 100;
		
		// Display the result
		System.out.println("Intrest Amount: " + res);

	}

}
