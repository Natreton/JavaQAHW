package iSkillo;

import java.util.Scanner;

public class HughAngles {

	public static boolean checkCondition(int alpha, int beta, int gama) {
		return ((alpha + beta + gama == 180) && alpha > 0 && beta > 0 && gama > 0); 
    
	
    } 
	
	public static void byInternalAngles(int alpha, int beta, int gama) {
		
		if ((alpha + beta + gama == 180) && alpha != 0 && beta != 0 && gama != 0) {
				
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
            		System.out.println("Can't form a triangle by given Angles. ");
			}
				
		
		
	}
	public static void byLengthsOfSides(int alpha, int beta, int gama) {
		
		if ((alpha + beta + gama == 180) && alpha != 0 && beta != 0 && gama != 0) {
			
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
			System.out.println("Can't form triangle sides by given Angles . ");
			}
	
		
		
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
		
		scan.close();
		
		 	if(checkCondition(alpha, beta, gama) == true) {
		 		
		 		System.out.print("The triangle is: Valid. "); 

				  byInternalAngles(alpha, beta, gama);
				 
				  byLengthsOfSides(alpha, beta, gama);
		 	}
		 	else {
		 		
		 		System.out.print("The triangle is: Invalid. "); 
		 	}
			
	}
}
