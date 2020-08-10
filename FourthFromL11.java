package iSkillo;

public class FourthFromL11 {
	
	
	 
	public static int findLargest() 
     { 
		 int[] myArr = {10, 324, 45, 90, 1000, 300, 450, 500};
         int i; 
           
         int max = myArr[0]; 
         
         for (i = 1; i < myArr.length; i++) 
             if (myArr[i] > max){
                 max = myArr[i]; 
	     }
         return max; 
     } 

	public static void main(String[] args) {
		System.out.println("The largest number is: " + findLargest()); 

	}

}
