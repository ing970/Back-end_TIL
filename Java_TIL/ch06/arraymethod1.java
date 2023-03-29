package ch06;

public class arraymethod1 {

	public static void main(String[] args) {
		int[] points = {1, 3, 1, 8};
		
		System.out.println("change 메서드 호출하기 전 points 출력");
		for(int i = 0; i < points.length; i++) {
			System.out.println("points[" + i + "] = " + points[i] );
		}
		System.out.println("===================================");
		change(points);
		System.out.println("change 메서드 호출하기 후 points 출력");
		for(int i = 0; i < points.length; i++) {
			System.out.println("points[" + i + "] = " + points[i] );
		}
		System.out.println("===================================");
	}
	public static void change(int[] myarr) {
		System.out.println("change 호출!!");
		System.out.println("myarr 출력!!");
		
		for(int i = 0; i < myarr.length; i++) {
			System.out.println("myarr[" + i + "] = " + myarr[i]);
		}
		System.out.println("===================================");
		System.out.println("myarr[2]를 100으로 바꿀꺼임!!");
		myarr[2] = 100;
		System.out.println("myarr[2]를 100으로 바꾼 후 !! myarr 출력!!");
		
		for(int i = 0; i < myarr.length; i++) {
			System.out.println("myarr[" + i + "] = " + myarr[i]);
		}
		System.out.println("===================================");
	}

}
