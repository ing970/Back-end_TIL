package ch05;

import java.util.stream.IntStream;

public class for2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + (3*i));
		} 
		/* 파이썬 range 방*/
//		IntStream.range(1, 10).forEachOrdered(
//				n -> {System.out.println("3 * " + n + " = " + (3*n));
//				}
//		);
	
	}

}
