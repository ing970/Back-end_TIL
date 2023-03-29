import java.util.Scanner;
public class Welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 도서 정보 'mBOOK'을 2차원 배열로 생성
		String[][] mBOOK = new String[NUM_BOOK][NUM_ITEM];
		// 입력 함수 호
		Scanner input = new Scanner(System.in);
		
		// 이름 입력
		System.out.print("당신의 이름을 입력하세요: ");
		String userName = input.next();
		
		// 연락처 입력
		System.out.print("연락처를 입력하세요: ");
		int userMobile = input.nextInt();
		
		// 인사말 정의
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		
		// 화면 시작
		boolean quit = false;
		while (!quit) {  
			
		// 인사말
		System.out.println("********************************************");
		System.out.println("\t" + greeting);	
		System.out.println("\t" + tagline);
		
		// 메뉴 정보 호출
		menuIntroduction();
		
		 // 메뉴 선택
		System.out.println("메뉴 번호를 선택해주세요. ");
		int n = input.nextInt();
		if (n < 1 && n > 8) {
			System.out.println("1부터 8까지의 숫자를 입력하세요.");
		}
		
		// 메뉴 선택에 따른 화면 전환
		else {
			switch(n){ 
				case 1:
					menuGuestInfo(userName, userMobile);
					break;
				case 2:
					menuCartItemList();
					break;
				case 3:
					menuCartClear();
					break;
				case 4:
					menuCartAddItem(mBOOK);
					break;
				case 5:
					menuCartRemoveItemCount();
					break;
				case 6:
					menuCartRemoveItem();
					break;
				case 7:
					menuCartBill();
					break;
				case 8:
					menuExit();		
					break;
				
			}
		 }
	  }
		input.close();
	
	}
	/* 각 메뉴 메소드 정리 */
	public static void menuIntroduction() {
		System.out.println("********************************************");
		System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t\t8. 종료");
		System.out.println("********************************************");
	}
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보: ");
		System.out.println("이름: " + name + "\t연락처: " + mobile);
	}
	public static void menuCartItemList() {
		System.out.println("장바구 상품 목록보기: ");
	}
	public static void menuCartClear() {
		System.out.println("장바구니 비우기");
	}
	// 도서 목록 표시하기
	public static void menuCartAddItem(String[][] book) {
		
		// BookList(도서정보) 불러옴.
		BookList(book);
		
		// 도서 정보 출력.
		for(int i = 0; i < NUM_BOOK; i++) {
			for(int j = 0; j < NUM_ITEM; j++)
				System.out.print(book[i][j] + "|");
			System.out.println(" ");
		}// end for
		
		// while 문 시작.
		boolean quit = false;
		while(!quit) {
			
			// 도서 ID 입력 받기.
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요: ");
			String str = input.nextLine();
			
			// flag, numId 정의.
			boolean flag = false;
			int numId = -1;
			
			// ID를 전체 조회한다. 
			for(int i = 0; i < NUM_BOOK; i++) {
				
				// 입력 받은 Id가 도서정보와 일치하면, i값을 반환하고 나온다.
				if(str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}// end if
			}// end for
			
			// 장바구니 도서 추가 여부 묻기.
			if(flag) {
				
				// 도서추가 여부를 위한 입력값 (Y | N)받음.
				System.out.println("장바구니에 추가하시겠습니까? Y | N ");
				str = input.nextLine();
			
       			// 입력값 (Y|N) 대문자 변경하여 Y이면 도서가 장바구니에 추가되었습니다 출력.
				if(str.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다.");
				}// end if
				quit = true;
				
			// Id값이 도서정보와 다르면, 출력.
			}else {
				System.out.println("다시 입력해 주세요.");
			}// end if, else
				
		}//end while
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	public static void BookList(String[][] book) {
		
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";
		
		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";
		
	    book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨터 사고룍을 키우는 블록 코딩";
		book[2][5] = "컴퓨터입문";
		book[2][6] = "2019/06/10";
	}
}
