import java.util.Scanner;
public class Left_Sided_Half_Pyramid_Inverse {
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = sc.nextInt();		// taking the number of rows from the user
        System.out.println(); 			// just an extra next line
        
        for(int i=1; i<=rows; i++) {	// this will iterate until the number of total rows
            for (int j=rows; j>=i; j--) {	// for printing star in decreasing order
                System.out.print("*");
            }
            System.out.println();		//this will move the cursor to the nextline and the star will print there
        }
	}
}

