import java.util.Scanner;

public class half_pyramid_leftsided {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = sc.nextInt();		      // taking the number of rows from the user
        System.out.println(); 			     // just an extra next line
        
        for(int i=1; i<=rows; i++) {	  // this will iterate until the number of total rows
            for (int j=1; j<=i; j++) {	// Print i number of stars
                System.out.print("* ");
            }
            System.out.println();		    //this will move the cursor to the next row and the star will print there
        }
        sc.close();
	}
}
