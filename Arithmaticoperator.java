package day03;

import java.util.Scanner;
public class Arithmaticoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner operator = new Scanner (System.in);
		
		System.out.println("Enter your First no:");
		int one = operator.nextInt();
		
		System.out.println("Enter your second no:");
		int Two = operator.nextInt();
		
		
		
		System.out.println( one + Two);
		System.out.println( one - Two);
		System.out.println( one * Two);
		System.out.println( one / Two);
		System.out.println( one % Two);
	}

}
