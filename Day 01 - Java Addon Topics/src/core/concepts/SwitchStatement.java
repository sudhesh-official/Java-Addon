package core.concepts;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Charecter(a to z): ");
		char c = in.next().charAt(0);
		/*
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println(c + " is a vowel..");
		} else {
			System.out.println(c + " is a constant..");	
		}
		
		switch (c) {
		case 'a': {
			System.out.println(c + " is a vowel..");
			break;
		}
		case 'e': {
			System.out.println(c + " is a vowel..");
			break;
		}
		case 'i': {
			System.out.println(c + " is a vowel..");
			break;
		}
		case 'o': {
			System.out.println(c + " is a vowel..");
			break;
		}
		case 'u': {
			System.out.println(c + " is a vowel..");
			break;
		}
		default:
			System.out.println(c + " is a constant..");
			break;
		}*/
		
		// Group Switch 
		switch (c) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': {
			System.out.println(c + " is a vowel..");
			break;
		}
		default:
			System.out.println(c + " is a constant..");
			break;
		}
	}

}
