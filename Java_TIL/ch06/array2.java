package ch06;

public class array2 {

	public static void main(String[] args) {
		
		String[] names = {"kim", "Lee", "Park"};
		// 배열에 저장된 데이터가 많아서 몇개인지 세기 어렵다.
		// names.lenght : 저장된 데이터의 수 리턴( 배열의 행의 개수 리턴)
		System.out.println("names.lenght = " + names.length);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("i = " + i);
			System.out.println("names[" + i + "] = " + names[i]);
			System.out.println("========================");
		}
	}

}
