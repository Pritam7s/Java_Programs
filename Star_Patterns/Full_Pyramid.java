import java.util.Scanner;
public class Full_Pyramid {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = sc.nextInt();		// taking the number of rows from the user
        System.out.println(); 			// just an extra next line
        
        for(int i=1; i<=rows; i++) {	// this will iterate until the number of total rows
         
            for(int j=rows; j>i; j--) {	// for printing space in decreasing order
                System.out.print(" ");
            }
            for(int k=1; k<=(i * 2) -1; k++) { // for printing star in increasing order (condition depends on the pattern; here pyramid * goes like 1,3,5,7.....)
                System.out.print("*");
            }
            System.out.println();		//this will move the cursor to the next line and the star will print there
        }
	}
}

