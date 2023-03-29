package ch03;
import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		// 1 이상 6 이하 정수 난수 1000개 생성 출력
		System.out.println("Math.random으로 난수 생성");
		for(int i = 0; i<1000; i++) {
			double x = Math.random() * 6;
			int temp = (int) x;
			System.out.println("생성 난수 = " + (temp + 1));
		}
		System.out.println("========================");
		
		Random rand = new Random();
		System.out.println("nextInt 으로 난수 생성");
		for (int i=0; i<1000; i++) {
		// 1 이상 7 미 정수 난수 리턴
			int x1 = rand.nextInt(1, 7);
			System.out.println("x1 = " + x1);
		}
	}

}
