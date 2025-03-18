package core.concepts;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter The Marital Status: (Married/Unmarried): ");
		String ms = in.nextLine().toLowerCase();
		
		if(ms.equals("married")) {
			System.out.println("You are eligible to the insurence.. ");
		} else if(ms.equals("unmarried")) {
			System.out.println("Enter the Below Details... ");
			System.out.println("Enter the Gender: (Male/Female): ");
			String gender = in.nextLine().toLowerCase();
			
			if (gender.equals("male") || gender.equals("female") ) {
				System.out.println("Enter Your age: ");
				int age = in.nextInt();
				if (gender.equals("male") && age>=30) {
					System.out.println("You are eligible to the insurence.. ");
				} else if (gender.equals("female") && age>=25) {
					System.out.println("You are eligible to the insurence.. ");
				} else {
					System.out.println("Not Eligible...");
				}
			} else {
				System.out.println("Invalid Gender Input... ");
			}
		}else {
			System.out.println("Invalid Marital Status");
		}

	}

}
