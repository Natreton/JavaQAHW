package hwProjectL12;

public class L12HW6 {

	public static void main(String[] args) {
		int sum = 0;
		int[][] myArr = new int [4][4];
		
		myArr[0][0] = 110;
		myArr[0][1] = 12;
		myArr[0][2] = 13;
		myArr[0][3] = 14;
		myArr[1][0] = 15;
		myArr[1][1] = 100;
		myArr[1][2] = 1123;
		myArr[1][3] = 12;
		myArr[2][0] = 18;
		myArr[2][1] = 13;
		myArr[2][2] = 11;
		myArr[2][3] = 6;
		myArr[3][0] = 9;
		myArr[3][1] = 2;
		myArr[3][2] = 3;
		myArr[3][3] = 4;
		
		for(int i=0;i<myArr.length;i++)
	     { 
	      for(int j=0;j<myArr.length;j++)
	      { 
	    	  if(i==j) 
	    	  {
	    		  sum = sum + myArr[i][j];
	    	  }
	}

  }
		 System.out.printf("The sum of main diagonal elements of the matrix = " + sum) ;
 }
}