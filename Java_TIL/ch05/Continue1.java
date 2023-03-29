package ch05;

public class Continue1 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("짝!!");
				System.out.println("===================");
				continue;
			}
			System.out.println("i = " + i);
//			System.out.println("===================");
		}

	}

}
