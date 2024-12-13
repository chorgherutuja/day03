package day03;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner positive = new Scanner (System.in);
		
		System.out.println("Enter first number");
		int a = positive.nextInt();
		
		
		if(a<0) {
			System.out.println("it is nagative number"+a);
		}else {
			System.out.println("it is positive number"+a);
		}
	}

}
