package ch03;

public class Method1 {	
	// 3-3-2 ~ 3
	// 호출 1번에 매개변수 타입 개수 일치하는 메서드 1개 실행.
	public static void main(String[] args) {
		System.out.println("square(4) 호출!!!");
		int m = square(4);
		System.out.println("m = " + m); //자바는 함수의 위치(순서)가 실행과 관계가 없다.
		System.out.println("======================");
		System.out.println("square(3.14) 호출!!!");
		double n = square(3.14);
		System.out.println("n = " + n);
		System.out.println("======================");
		System.out.println("square(10, 20) 호");
		int o = square(10, 20);
		System.out.println("o = " + o);
		System.out.println("======================");
		System.out.println(Math.PI);
		
		// Math.rnadom(): 0 이상 1 미만 난수 리턴.
		double x = Math.random();
		System.out.println("x = " + x);
		
		// Math.random(): 0 이상 0.99999999999999999 이하 난수 리턴.
		// Math.random() * 6: 0 이상 5.99999999999999999 이하 난수 리턴.
		System.out.println("x*6 = " + (x*6));
		
		// Math.random(): 0 이상 0.99999999999999999 이하 난수 리턴.
		// Math.random() * 6: 0 이상 5.99999999999999999 이하 난수 리턴.
		// (int)Math.random() * 6: 0 이상 5 이하 정수 난수 리턴.
		int temp = (int) (x * 6);
		System.out.println("temp = " + temp);
		
		// Math.random(): 0 이상 0.99999999999999999 이하 난수 리턴.
		// Math.random() * 6: 0 이상 5.99999999999999999 이하 난수 리턴.
		// (int)Math.random() * 6: 0 이상 5 이하 정수 난수 리턴.
		// ((int)Math.random() * 6) + 1: 1 이상 6 이하 정수 난수 리턴.
		System.out.println("temp + 1 = " + (temp + 1));
	}
	
	
	
	
	
	
	
	
	// 같은 함수 중복 구현 불가.	
//	public static int square(int length) { 	
//	System.out.println("length = " + length); 
//	return length * length;
//		
//	}
	public static int square(int length) { // 받을 값의 타입을 정해준다. square(n) -> square(int n)
		System.out.println("one int square!!");
		System.out.println("length = " + length); 
		return length * length; // 리턴할 값의 타입을 정해준다.	static square -> static int square
	}
	
	// 매개변수 타입 다를때 중복 가능.
	public static double square(double length) {
		System.out.println("double square!!");
		System.out.println("length = " + length); 
		return length * length;
	}
	// 매개변수 개수 다를때 중복 가능.
	public static int square(int length1, int length2) { 
		System.out.println("two int square!!!");
		return length1 * length2;
	}

}
