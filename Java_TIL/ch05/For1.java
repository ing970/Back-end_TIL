package ch05;

import java.util.stream.IntStream;

public class For1 {

	public static void main(String[] args) {
//		int [] num = {0, 1, 2, 3, 4};
//		
//		for(int el: num) {
//			System.out.println("el = " + el);
//		}
		/* 제일 효율적인 방식 */
		for(int el = 0; el < 5; el++) {
			System.out.println("el = " + el);
		}
		
//		/* 파이썬 range(0, 10) 처럼 구현하고 싶다!! */
//		IntStream.range(0, 10).forEachOrdered(
//				n -> { // 리턴 n,lambda 함수 형식이다.
//					System.out.println("n = " + n);
//				}
//		);
	}

}
