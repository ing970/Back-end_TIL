package ch06;

public class array3 {

	public static void main(String[] args) {
		/*
		 * 배열을 선언만 하고 값을 설정 안하
		 * int[]scores;
		 * System.out.println(scores[0]); -> 사용할때 에러!!
		 */
		int [] scores = new int[4];
		System.out.println("scores.length = " + scores.length);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
	}

}
