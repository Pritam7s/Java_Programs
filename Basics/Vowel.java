// Program to Check a Character Vowel or not?


import java.util.Scanner;
public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter an Alphabet: ");
		c=sc.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
			System.out.println("Its a Vowel.");
		}
		else {
			System.out.println("Its an Alphabet");
		}
	}
}
