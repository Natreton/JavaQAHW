package iSkillo;
import java.util.Scanner;

public class SkilloTravel {

	public static void main(String[] args) {
		
		System.out.println("Welcome to SkilloTravel. ");
		System.out.println("Choose where do you want to go on vacation. ");
		System.out.println("We offer you vacation on the Beach or in the Mountain. ");
		System.out.println("Type which you prefer: Beach or Mountain");
		
		Scanner typeVac = new Scanner (System.in);
		
		String userPick = typeVac.nextLine();
		
		switch (userPick) {
		
		case "Beach":
		case "beach":
			System.out.println("Great! You choose Beach. ");
			System.out.println("What is your Budget for the vacation per day? ");
			System.out.println("More or less then 50 leva? ");
			System.out.print("Ånter the amount:");
			int userBeachBudget = typeVac.nextInt();
			if (userBeachBudget < 50 ) {
				System.out.println("We offer you Bulgaria as a destination");
				System.out.println("Have a nice day!");
			}
			if (userBeachBudget >= 50 ) {
				System.out.println("We offer you to go outside of Bulgaria");
				System.out.println("Have a nice day!");
			}
			break;
		case "Mountain":
		case "mountain":	
			System.out.println("Great! You choose Mountain. ");
			System.out.println("What is your Budget for the vacation per day? ");
			System.out.println("More or less then 30 leva? ");
			System.out.print("Ånter the amount:");
			int userMBudget = typeVac.nextInt();
			if (userMBudget < 30 ) {
				System.out.println("We offer you Bulgaria as a destination");
				System.out.println("Have a nice day!");
			}
			if (userMBudget >= 30 ) {
				System.out.println("We offer you to go outside of Bulgaria");
				System.out.println("Have a nice day!");
			}
			break;
		default:
			System.out.println("There is no information about this type of vacation.");
		}
		
		typeVac.close();
	}

}
