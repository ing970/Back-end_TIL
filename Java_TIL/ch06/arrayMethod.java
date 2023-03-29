package ch06;

public class arrayMethod {

	public static void main(String[] args) {
		int[] points = {1, 3, 1, 8};
		double results = average(points);
		System.out.println("results = " + results);
	}

	private static double average(int[] arr) {
		System.out.println("average call!!");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
			sum += arr[i];
			System.out.println("sum = sum + arr[" + i + "] 헀음");
		}
		
		System.out.println("sum = " + sum);
		
//		double avg = sum / arr.length;
//		자바에서 정수 타입 변수 끼리 연산 결과는 정수이다
//		sum(13) / arr.length(4) -> 3.25 아닌 3이 나온
//		따라서 실수 타입으로 바꿔서 계산 징행.
		
		double avg = (double)sum / (double)arr.length;
		System.out.println(avg);
		System.out.println("average end!!");
		return avg;
		
	}

}
