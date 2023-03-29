package ch06;

public class CharArray {

	public static void main(String[] args) {
		String str = "Programming is fun!!";
		/*
		 * 파이썬에서
		 * str1 = "Programming is fun!!"
		 * 
		 * str1[2] -> "o" 리턴
		 * 
		 * 파이썬은 문자열이 리스트!!
		 * 
		 * 자바는
		 * String str1 = "Programming is fun!!"; 일때
		 * str1[2] -> 에러!!
		 * 문자열과 배열(list)은 다름!!
 		 */
		String str1 = "Programming is fun!!";
		/* 문자열 str1을 배열로 바꾸고 나서 한글자씩 꺼낼 수 있음!!!*/
		char[] charArr = str1.toCharArray();
		System.out.println("charArr.length = " + charArr.length);
		
		int count = 0;
		for(int i = 0; i < charArr.length; i++) {
			System.out.println("charArr[" + i + "] = '" + charArr[i] + "'");
			if(charArr[i] == 'R' || charArr[i] == 'r') {
				System.out.println("R 찾음!!! count 1증가 할꺼임!!");
				count ++;
			} //end if
			System.out.println("==============================");
		} // end for
		System.out.println("count = " + count);
	} // end main

}
