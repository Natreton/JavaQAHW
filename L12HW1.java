package hwProjectL12;

public class L12HW1 {
	
	  static int sumAR() 
	     { 
	    	 int[] arrN = {12,3,4,15};
	         int sum = 0;  
	         int i;
	        
	         
	         for (i = 0; i < arrN.length; i++) 
	            sum +=  arrN[i]; 
	        
	         return sum; 
	     } 

	public static void main(String[] args) {
		 
		System.out.println("Sum is: " + sumAR()); 
	    
	   
	}

}
