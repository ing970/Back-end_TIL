import java.util.Scanner;

public class Welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static Scanner input = new Scanner(System.in);
	static Cart mCart = new Cart();
	static User mUser;
	
	public static void main(String[] args) {

		Book[] mBookList = new Book[NUM_BOOK];
		// 입력 함수 호
		Scanner input = new Scanner(System.in);
		
		// 이름 입력
		System.out.print("당신의 이름을 입력하세요: ");
		String userName = input.next();
		
		// 연락처 입력
		System.out.print("연락처를 입력하세요: ");
		int userMobile = input.nextInt();
		
		// 사용자 정보 저장하기 
		mUser = new User(userName, userMobile);
		
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
		if (n < 1 && n > 9) {
			System.out.println("1부터 9까지의 숫자를 입력하세요.");
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
					menuCartAddItem(mBookList);
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
				case 9:
					menuAdminLogin();
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
		System.out.println("9. 관리자 로그인");
		System.out.println("********************************************");
	}
	// 저장되어있는 고객의 이름과 전화번호를 불러온다.
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보: ");
		System.out.println("이름: " + mUser.getName() + ", 연락처: " + mUser.getPhone());
		
	}
	// 장바구니 추가 장바구니 리스트 출력
	public static void menuCartItemList() {	
		if (mCart.mCartCount >= 0)
			mCart.printCart();
	}
	// 장바구니 비우기
	public static void menuCartClear() {
		if (mCart.mCartCount == 0) 
			System.out.println("장바구니에 항목이 없습니다.");
		else {
			System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N");
//			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			
			if (str.toUpperCase().equals("Y")) {
				System.out.println("장바구니의 모든 항목을 삭제했습니다.");
				mCart.deleteBook();
			}
		}
	}
	// 도서 목록 표시하기
	public static void menuCartAddItem(Book[] booklist) {
		
		// BookList(도서정보) 불러옴.
		BookList(booklist);
		
		// 도서 정보 출력.
		mCart.printBookList(booklist);
		
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
				if(str.equals(booklist[i].getBookId())) {
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
			
       			// 입력값 (Y | N) 대문자 변경하여 "Y"이면, "도서가 장바구니에 추가되었습니다" 출력.
				if(str.toUpperCase().equals("Y")) {
					System.out.println(booklist[numId].getBookId() + "도서가 장바구니에 추가되었습니다.");
					// 장바구니에 넣
					if (!isCartInBook(booklist[numId].getBookId())) {
						mCart.insertBook(booklist[numId]);
				}// end if
				quit = true;
			  }else {
				System.out.println("다시 입력해 주세요.");
		    }// end else
				
		  }//end if(flag)
	   }//end while
    }
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() {
//		System.out.println("6. 장바구니의 항목 삭제하기");
		if(mCart.mCartCount == 0) {
			System.out.println("장바구니에 항목이 없습니다.");
		}else {
			menuCartItemList();
			boolean quit = false;
			while (!quit) {
				System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요: ");
//				Scanner input = new Scanner(System.in);
				String str = input.nextLine();
				boolean flag = false;
				int numId = -1;
				
				for (int i = 0; i < mCart.mCartCount; i++) {
					if (str.equals(mCart.mCartItem[i].getBookID())) {
						numId = i;
						flag = true;
						break;
					}
				}
			if (flag) {
				System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N");
				str = input.nextLine();
				if (str.toUpperCase().equals("Y")) {
					System.out.println(mCart.mCartItem[numId].getBookID() + "장바구니에서 도서가 삭제되었습니다.");
					mCart.removeCart(numId);
				}
			    quit = true;
			  }
			else System.out.println("다시 입력해 주세요.");
		  }//end while
		}// end else
	}// end public
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	public static void menuAdminLogin() {
		System.out.println("관리자 정보를 입력하세요.");
//		Scanner input = new Scanner(System.in);
		
		// 아이디 입력:
		System.out.print("아이디: ");
		String adminId = input.next();
		
		// 비밀번호 입력
		System.out.print("비밀번호: ");
		String adminPw = input.next();
		
		// admin에 mUser로 저장한 이름과 전화번호를 불러온다.
		Admin admin = new Admin(mUser.getName(), mUser.getPhone());
		// 만약 입력한 아이디와 비밀번호가 Admin 파 안에있는 아이디와 비밀번호가 일치한다면.
		if (adminId.equals(admin.getId()) && adminPw.equals(admin.getPassword())) {
			System.out.println("이름: " + admin.getName() + "   연락처: " + admin.getPhone());
			System.out.println("아이디: " + admin.getId() + "    비밀번호: " + admin.getPassword());
		}else {
			System.out.println("관리자 정보가 일치하지 않습니다.");
		}
	}
	// 도서 정보 정보
	public static void BookList(Book[] booklist) {
		booklist[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000);
		booklist[0].setAuthor("송미영");
		booklist[0].setDescription("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍");
		booklist[0].setCategory("IT전문서");
		booklist[0].setReleaseDate("2018/10/08");
		
		booklist[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000); 
		booklist[1].setAuthor("우재남");
		booklist[1].setDescription("실습 단계별 명쾌한 멘토링");
		booklist[1].setCategory("IT전문서");
		booklist[1].setReleaseDate("2022/01/22");
		
		booklist[2] = new Book("ISBN1236", "스크래치", 22000);
		booklist[2].setAuthor("고광일");
		booklist[2].setDescription("컴퓨터 사고룍을 키우는 블록 코딩");
		booklist[2].setCategory("컴퓨터입문");
		booklist[2].setReleaseDate("2019/06/10");
	}
	public static boolean isCartInBook(String bookId) {
		return mCart.isCartInBook(bookId);
	}
}
