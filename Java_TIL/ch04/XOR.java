package ch04;

public class XOR {

	public static void main(String[] args) {
		/*
		 * 파이썬 3 ^ 2 => 9
		 * 파이썬 ^ 는 '승'을 계산
		 * 
		 * 자바의 ^ 는 XOR 연산
		 * XOR 연산자는 두개가 같으면 false 두개가 다르면 true
		 * 자바는 true는 1 false 0 
		 * 정수일때는 각 비트별로 XOR 연산 된 후 결과가 10진수로 변
		 */
		int a = 3 ^ 2; // 3과 2는 다름으로 true => 1
		/*
		 * 3 => 이진수 11
		 * 2 => 이진수 10
		 * 
		 * XOR => 01 -> 1
		 */
		System.out.println("a = " + a);
		
		int b = 3 ^ 3; // 3과 3은 같음으로 false => 0
		/*
		 * 3 (이진수) => 11
		 * 3 (이진수) => 11
		 * 
		 * xOR => 00 -> 0
		 */
		System.out.println("b = " + b); //0
		
		/*
		 * 100 (이진수) => 0 1 1 0 0 1 0 0
		 * 200 (이진수) => 1 1 0 0 1 0 0 0
		 * 
		 * XOR (이진수) => 1 0 1 0 1 1 0 0 -> 172(십진수)	
		 */
		System.out.println("100 ^ 200 =" + (100 ^ 200));
		
		boolean c = (true ^ false);
		System.out.println("c = " + c); // 1
		
		boolean d =(true ^ false);
		System.out.println("d = " + d); // 0
		
		/* 자바의 3의 2승 */
		
		double p = Math.pow(3,  2);
		System.out.println("p = " + p);
	
	}

}
