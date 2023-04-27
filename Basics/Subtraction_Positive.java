/*
Subtract any 2 numbers but get always positive result (mostly when the first number is smaller than the second number)
*/

import java.util.Scanner;
public class Subtraction_Positive {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);            //scanner is used to take user input
		System.out.println("Enter the First number: ");
		a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		b = sc.nextInt();
		
		if(b>a) {
			c = b-a;
			System.out.println("Subtraction Value is: " + c);
		}
		else {
			c = a-b;
			System.out.println("Subtraction Value is: " + c);
		}
	}
}
