package ch06;

public class circulator {

	public static void main(String[] args) {
		/*
		 * 자바에서 정수 타입 변수 끼리 연산 결과는 무조건 정수!!
		 */
		int a = 3;
		int b = 2;
		System.out.println(a / b); // 1.5가 아닌 1

		double c = a / b;
		System.out.println("c = " + c); // 1.5 아닌 1
		
		/*
		 * 정수를 실수로 바꾸는 방법
		 * (double)a
		 */
		System.out.println("(double)a = " + (double)a); //실수로 변해서 3.0
		
		
		// 실수끼리 연산이므로 결과는 실수
		double d = (double) a / (double) b;
		System.out.println("d =" + d); // 1.5
	}

}
