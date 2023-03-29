package CH02;

public class Variable1 {

	public static void main(String[] args) {
		int age = 21 ;
		
		// age = "먹을만큼 먹었다"; -> 에러 // 정수만 저장
		
		String name = "김한빛";
		System.out.println("안녕 반가워 내이름은 " + name + " 입니다!!!");
		System.out.println("내 나이는 " + age + "입니다.");
		
		//int housePrice = 280000000;
		long housePrice = 280000000L;
		System.out.println("반포자이 집값!!!" + housePrice);
		
		double rating = 9.82;
		System.out.println("평점: " + rating);
		
		boolean hungry = true;
		System.out.println("나는 배고픈가? " + hungry);
		/*
		 * 파이썬과 같이 true -> 1 저장
		 * false -> 0 저
		 * 
		 * 자바는 true false 와 정수 연산 비교 불가능.
		 * 자바 true + false -> 에러.
		 * 자바 true + true + false -> 에러.
		 * 자바 true == 1 -> 에
		 * 
		 * 파이썬은 True False 와 정수 연산 비교 가능
		 * 파이썬 True + True + False + 100 = 102
		 * 파이썬 True == 1 -> True 
		 */
		boolean isBoomuk = true;
//		isBoomuk + 100; -> 에러
//		isBoomuk + false; -> 에러
//		isBoomuk == 1; -> 에러(정수와 비교 불가)
		 
		// 03 변수의 활용
//		상수 정의 
		final int NOT_FOUND = 404;
//		NOT_FOUND = 200; -> 에러, 상수값을 변경 불가
		/*
		 * 기본 타입은 값 복사
		 * 원본 사본 2개
		 * 사본 바꿔도 원본 안바뀜.
		 */
		double origin = 3.14;
		double copy = origin;
		System.out.println("origin: " + origin); // 3.14
		System.out.println("copy: " + copy); // 3.14
		copy = 1004;
		System.out.println("copy를 1004로 바꾼 후!!!");
		System.out.println("origin: " + origin); // 3.14
		System.out.println("copy: " + copy); // 1004.0
		
		/*
		 * 레퍼런스 타입은 값 공유
		 * 1개의 값이 공유됨.	
		 * 하나를 바꾸면 나머지도 변
		 */
		// 레퍼런스 타입 생
		StringBuffer sbOrigin = new StringBuffer("안녕");
		// 값 공유
		StringBuffer sbCopy = sbOrigin;
		System.out.println("sbOrigin = " + sbOrigin);
		System.out.println("sbCopy = " + sbCopy);
		//sbCopy에 문자열 추가
		sbCopy.append("반가워");
		System.out.println("sbCopy 문자열 추가 후 !!!");
		System.out.println("sbOrigin = " + sbOrigin);
		System.out.println("sbCopy = " + sbCopy);
		System.out.println("============================");
		
//		sbOrigin과 sbCopy 둘다 원본 1개를 공유한다.
//		따라서 '안녕'이라는 원본을 공유한 상태에서 '반가워'를 추가함으로
//		두 변수 둘다 값복사가 된다.
		
		String item = "라면";
		long price = 8000000000L; // long은 뒤에 L을 붙인다.
		float weight = 0.12F; // float 은 뒤에 F를 붙인다.
		boolean discount = false;
		
		System.out.printf(
				            "이름: %s, 가격: %d원, 무게: %.2f, 할인: %b",
				           
				             item, price, weight, discount
				           ); 
		// 04
		
		// \t -> 4칸 띄어쓰(들여쓰)
		System.out.println("\n2*1=2\t3*1=3\t4*1=4");
		
	}

}
