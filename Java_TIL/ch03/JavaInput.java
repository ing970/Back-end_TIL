package ch03;
import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을: "); // println은 그 다음줄에 출력, print는 그줄 옆에 출
		String name = input.next();
		System.out.println("name = " + name);
		
		System.out.print("연락처: ");
		int userMobile = input.nextInt();
		System.out.println("userMobile = " + userMobile);
		
		// input을 하고 입력이 다 끝나면 input.close를 입력한다.
		input.close(); //

	}

}
