package ch06;

public class MultiArray1 {

	public static void main(String[] args) {
		int[] row1 = {1, 2, 3, 4};
		int[] row2 = {5, 6, 7, 8, 10};
		
		int[][] matrix = {row1, row2};
		
		System.out.println("matrix[0][0] = " + matrix[0][0]); //1
		System.out.println("matrix[0][1] = " + matrix[0][1]); //2
		System.out.println("matrix[0][4] = " + matrix[0][3]); //4
		System.out.println("matrix[1][2] = " + matrix[1][2]); //7
		System.out.println("matrix[1][4] = " + matrix[1][4]); //10
		
		System.out.println("matrix[0].length = " + matrix[0].length);
		System.out.println("matrix[1].length = " + matrix[1].length);
		System.out.println("matrix.length = " + matrix.length);
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.println("i = " + i);
			System.out.println("matrix[" + i + "].length = " + matrix[i].length);
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println("j = " + j);
				System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
			}//end for j
			System.out.println("==========================");
		}//end for i
	}// end main

}// end class
