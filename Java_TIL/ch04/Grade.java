package ch04;

public class Grade {

	public static void main(String[] args) {
		printGrade(85);
	}
	public static void printGrade(int score) {
		char grade; 
		// grade에 들어갈 변수가 한글자 이기 때문에 char 가능
		//(char 타입도 글씨 1개만 가능하다)
		if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		
		}
		System.out.printf("점수: %d, 학점: %c\n", score, grade);
		
		switch(grade) {
		case 'A':
			System.out.println("장학금 100만원");
//			break;
		case 'B':
			System.out.println("백화점상품권 50만");
//			break;
		case 'C':
			System.out.println("도서상품권 30만원");
//			break;
		default:
			System.out.println("교수님 격려");
				
		}
		
		int n = 13;
		String result = (n % 2 == 0)? "짝수" : "홀수";
		System.out.println("result = " + result);
		
	}
	
}


