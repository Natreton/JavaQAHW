package iSkillo;
import java.util.Scanner;

public class ThirdFromL11 {
	
	public static double disCount(double unitPrice, double enterQuant) {
		
		double discM, discB, revenue, calcPrice, calcDiscount, dM, dB;
		int dN;
		discM = 100 - 15;
		discB = 100 - 20;
		dM = 15;
		dB = 20;
		dN = 0;
		calcPrice = unitPrice * enterQuant;
		
		
		if ((enterQuant >= 100) && (enterQuant <= 120)) {
			revenue = (discM * calcPrice)/100;
			System.out.println("The revenue from sale: " + revenue + "$" );
			
			calcDiscount = calcPrice - revenue;
			System.out.println("After discount: " + calcDiscount + "$" + "(" + dM + "%" + ")" );
			
		}
		if (enterQuant > 120) {
			revenue = (discB * calcPrice)/100;
			System.out.println("The revenue from sale: " + revenue + "$");
			
			calcDiscount = calcPrice - revenue;
			System.out.println("After discount: " + calcDiscount + "$" + "(" + dB + "%" + ")" );
			
			
		}
		if (enterQuant < 100) {
			revenue =  calcPrice;
			System.out.println("The revenue from sale: " + revenue + "$");
			
			calcDiscount = calcPrice - revenue;
			System.out.println("After discount: " + calcDiscount + "$" + "(" + dN + "%" + ")" );
			
		}
		
		
	return 0;
	}

	public static void main(String[] args) {
		
	
		
		
		System.out.println("Program for discount calculation. ");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter unit price: ");
		double unitPrice   = scan.nextDouble();
		System.out.print("Enter quantity: ");
		double enterQuant  = scan.nextDouble();
		
		scan.close();
		
		disCount(unitPrice, enterQuant);
		
	}

}