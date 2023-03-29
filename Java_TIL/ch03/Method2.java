package ch03;

public class Method2 {
	
	public static void printHello(String msg) { // 반환값이 없을 경우 'void' 추가
		System.out.println("Hello" + msg);
//		return; -> 생략 가능
	}
	public static void main(String[] args) {
		printHello("야옹이");
		/*
		 * 파이썬에서는 다음과 같을때 printHello() 함수 리턴값이 없어서
		 * 변수 result에 None 저장 잘 실행됨
		 * result = printHello("야옹이");
		 * 
		 * 자바는 컴파일 에러
		 * printHellow() 함수 리턴값이 없는데
		 * 변수 result에 리턴값 저장 하려고 하면 에
		 * result = printHellow("야옹");
		 */
//		Object result = printHello("야옹이"); -> 에러!!

	}

}
