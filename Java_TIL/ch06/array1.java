package ch06;

public class array1 {

	public static void main(String[] args) {
		/*
		 * 자바 배열은 파이썬 리스트와 같이 여러개의 값 저장
		 * 
		 * 파이썬 리스트 (여러 타입 데이터 저장)
		 * lst = [1, '안녕', 0.3]
		 * 
		 * 자바의 배열은 선언된 타입만 저장 가능.
		 */
		int[] scores = {88, 96, 68, 72, 47};
		
		int[] point = {10, 7, 9, 9};
		
		// 정수만 저장 가능
		// int [] point = {10, 7, 9, 9, , 10.8}; -> 컴파일 에러
//		System.out.println("scores[0] = " + scores[0]);
//		System.out.println("scores[1] = " + scores[1]);
//		System.out.println("scores[2] = " + scores[2]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			System.out.println("scores[" + i + "] = " + scores[i]);
			System.out.println("================================");
		}

	}

}
