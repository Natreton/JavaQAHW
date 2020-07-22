package hwProjectL12;

public class L12HW2 {

	public static void main(String[] args) {
	 int[][] arr = new int [4][3];
	 arr[0][0] = 1;
	 arr[0][1] = 3;
	 arr[0][2] = 4;
	 arr[1][0] = 12;
	 arr[1][1] = 6;
	 arr[1][2] = 25;
	 arr[2][0] = 100;
	 arr[2][1] = 1123;
	 arr[2][2] = 9;
	 arr[3][0] = 0;
	 arr[3][1] = 4;
	 arr[3][2] = 10;
	 
	 
	
	 for (int i = 0; i < 4; i++) { 
		 for (int j = 0; j < 3; j++) { 
			 System.out.println(arr[i][j]); 
			 } 
		 }

	}

}
