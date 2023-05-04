import java.util.Scanner;
public class Pyramid_Inverse {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = sc.nextInt();		// taking the number of rows from the user
        System.out.println(); 			// just an extra next line
        
        for(int i=rows; i>=1; i--) {	// this will iterate in decrement order in rows due to inverse pattern
       
            for(int j=i; j<rows; j++) {	// for printing space in increasing order
                System.out.print(" ");
            }
            for(int k=1; k<=(i * 2) -1; k++) { // for printing star in decreasing order (condition depends on the pattern here 1,3,5,7.....)
                System.out.print("*");
            }
            System.out.println();		//this will move the cursor to the next line and the star will print there
        }
	}
}

