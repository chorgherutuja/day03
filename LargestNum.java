package day03;
import java.util.Scanner;
public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner largest = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = largest.nextInt();
		
		System.out.println("Enter second number:");
		int b = largest.nextInt();
		
		if(a > b) {
			System.out.println("a is greater number" +a);
		}else {
			System.out.println("a is greater number" +b);
		}
		
		
	}

}
