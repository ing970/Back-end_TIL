package ch06;

public class gugudan1 {

	public static void main(String[] args) {
		int[][] gugudan = new int[10][10];
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				gugudan[i][j] = i * j;
			}
		}
		System.out.printf("2 X 7 = %d\n", gugudan[2][7]);
		System.out.printf("9 X 4 = %d\n", gugudan[9][4]);

	}

}
