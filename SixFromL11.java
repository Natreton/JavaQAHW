package iSkillo;

public class SixFromL11 {

	public static void main(String[] args) {
		int[] myNum = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		System.out.println("Will divide  the numbers by 5 and will skip numbers greater then 150 ");
		System.out.println();
		
		for (int i = 0; i < myNum.length; i++) {
			if (myNum[i] % 5==0) {
				System.out.println("The number in the array: " + myNum[i] + " is divisible by 5 ");
				if (myNum[i] >= 150) {
						System.out.println();
						System.out.println("If there are other numbers they are skipped. ");
						
						break;
						}
			}
		}
	}

}