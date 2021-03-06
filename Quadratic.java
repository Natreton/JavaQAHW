package iSkillo;
import java.util.Scanner;
import java.lang.Math;

public class Quadratic {

	public static void main(String[] args) {
		
		 double root1, root2;
		
		 Scanner input = new Scanner(System.in);

         System.out.print("Input a: ");
         double a = input.nextDouble();
         System.out.print("Input b: ");
         double b = input.nextDouble();
         System.out.print("Input c: ");
         double c = input.nextDouble();

         input.close();
         
         double discriminant = b * b - 4 * a * c;
         
         if(discriminant > 0) {
             root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
             root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

             System.out.printf("root1 = " + root1 + " root2 = " + root2);
         }
         else if(discriminant == 0) {
             root1 = root2 = -b / (2 * a);

             System.out.printf("root1 = root2 " + "There is only one root and it is: " + root1);
         }
         else {
             System.out.println("No real roots");
         }
	}
}