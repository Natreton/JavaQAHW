package hwProjectL12;
import java.util.Arrays;
import java.util.Scanner;

public class L12HW3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows do you want? ");
		int rows = scan.nextInt();
		System.out.println("How many columns do you want? ");
		int columns = scan.nextInt();
		
		int[][] table = new int[rows][columns];
		 
		 System.out.println("Enter table elements for each row : ");
		
		 for (int i=0; i < rows; i++) {
			 for (int j=0; j < columns; j++) {
				 int value = scan.nextInt();
				 table[i][j] = value;
			 }
			 
		 }
		
		 System.out.println("The elements in 2D matrix from user input are : ");
		   System.out.println(Arrays.deepToString(table));
		
		 scan.close();
	}

}