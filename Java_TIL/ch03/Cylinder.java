package ch03;

public class Cylinder {

	public static void main(String[] args) {
		double r = 7;
		double h = 5;
		double v = volume(r,h); // 메소드 호출부
		
		System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", 
							r, h, v);
	}
	public static double volume(double radius, double height) { // 메소드 정의
		return Math.PI * radius * radius * height;
		
	}

}
