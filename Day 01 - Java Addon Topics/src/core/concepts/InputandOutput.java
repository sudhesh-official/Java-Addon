package core.concepts;

import java.util.Scanner;

public class InputandOutput {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Get Integer input: ");
		int a = in.nextInt();
		System.out.println("Get byte input: ");
		byte b = in.nextByte();
		System.out.println("Get short input: ");
		short c = in.nextShort();
		System.out.println("Get long input: ");
		long d = in.nextLong();
		
		System.out.println("Get float input: ");
		float e = in.nextFloat();
		System.out.println("Get double input: ");
		double f  = in.nextDouble();
		
		
		System.out.println("Get boolean input: ");
		boolean g  = in.nextBoolean();
		
		System.out.println("Get char input: ");
		char h  = in.next().charAt(0);
		
		System.out.println("Enter Your Name: ");
		in.nextLine();
		String name = in.nextLine();
		
		
		System.out.println("Integer Input Result: " + a);
		System.out.println("Byte Input Result: " + b);
		System.out.println("short Input Result: " + c);
		System.out.println("long Input Result: " + d);
		
		System.out.println("float Input Result: " + e);
		System.out.println("double Input Result: " + f);
		
		System.out.println("Boolean Input Result: " + g);
		
		System.out.println("char Input Result: " + h);
		
		System.out.println("String Input Result: " + name);
	}

}
