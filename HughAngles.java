package iSkillo;

import java.util.Scanner;

public class HughAngles {

	public static int checkCondition(int alpha, int beta, int gama) { 
        // check condition 
        if (alpha + beta + gama == 180 && alpha > 0 && beta > 0 && gama > 0) 
            return 1;
        else  
            return 0; 
    } 
	
	public static int byInternalAngles(int alpha, int beta, int gama) {
		
		if (alpha + beta + gama == 180 && alpha != 0 && beta != 0 && gama != 0) {
				
			if ((alpha + beta == gama || 
					alpha + gama == beta || 
						beta + gama == alpha
					) && (alpha == 90 || beta == 90 || gama == 90))
						System.out.print("By Internal Angles is: Right. ");
            		
		
            else if ((alpha + beta > gama ||
            			alpha + gama > beta ||
            				beta + gama > alpha
            		) && (alpha < 90 && beta < 90 && gama < 90))
            			System.out.print("By Internal Angles: is Acute. ");
					
		
            else if ((alpha + beta < gama ||
        				alpha + gama < beta ||
        					beta + gama < alpha
            		) && (alpha > 90 || beta > 90 || gama > 90))
				 
						System.out.print("By Internal Angles is: Obtuse. ");
			
		}
		
		else {
            		System.out.println("Can't form a triangle. ");
			}
				
				return 1;
		
	}
	public static int byLengthsOfSides(int alpha, int beta, int gama) {
		
		if (alpha + beta + gama == 180 && alpha != 0 && beta != 0 && gama != 0) {
			
			if	((alpha == beta &&
						beta == gama) && (alpha < 90 || beta < 90 || gama < 90))
					System.out.print("ByLengthsOfSides is: Equilateral. ");
			
			else if	(alpha == beta ||
						beta == gama ||
							gama == alpha )
					System.out.print("By Lengths Of Sides is: Isoselec. ");
			
			else if	(alpha != beta &&
						beta != gama &&
							gama != alpha )
				System.out.print("By Lengths Of Sides is: Scalene. ");
		}
		
		else {
			
			}
		return 1;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("The sum of the angles must be equal to 180 degree!");
		System.out.println("As well as no angle should be equal to Zero!");
		System.out.println("The input value for angles should not be negative!");
		System.out.println("Enter the angels of triangle:");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Alpha is:");
		int alpha = scan.nextInt(); 
		
		System.out.print("Beta is:");
		int beta = scan.nextInt(); 
		
		System.out.print("Gama is:");
		int gama = scan.nextInt();
		
		scan.close(); // ej tova kolko li e vajno ?
		
		 if (checkCondition(alpha, beta, gama) == 1)  {
			 System.out.print("The triangle is: Valid. "); 
			 
			  byInternalAngles(alpha, beta, gama);
			 
			  byLengthsOfSides(alpha, beta, gama);
			 
		 }      
	     else
	            System.out.print("The triangle is: Invalid. "); 

	}
}