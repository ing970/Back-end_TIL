package ch05;

public class for3 {
//  p.234 문제 풀이
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			sum += i;
			if (i == 10) {
				break;
			}
			System.out.print("+");
		}
		System.out.printf(" = %d", sum);

	}

}
