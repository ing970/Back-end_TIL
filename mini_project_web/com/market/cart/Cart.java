package ch_6.com.market.cart;

import ch_6.com.market.bookitem.Book;


// 장바구니 관리
public class Cart implements CartInterface {
	// 전체 책 종류 수
	static final int NUM_BOOK = 3;
	// 장바구니
	public CartItem[] mCartItem = new CartItem[NUM_BOOK];
	// 장바구니 담은 책 권수
    public int mCartCount = 0;
	
	public Cart() {
		
	}
	
	public void printBookList(Book[]booklist) {
		for(int i = 0; i < booklist.length; i++) {
			System.out.print(booklist[i].getBookId() + " : "); 
			System.out.print(booklist[i].getName() + " : ");
			System.out.print(booklist[i].getUnitPrice() + " : ");
			System.out.print(booklist[i].getAuthor() + " : ");
			System.out.print(booklist[i].getDescription() + " : ");
			System.out.print(booklist[i].getCategory() + " : ");
			System.out.print(booklist[i].getReleaseDate());
			System.out.println("");
		}
	}
	public void insertBook(Book book) {
		mCartItem[mCartCount++] = new CartItem(book);
	}
	public void deleteBook() {
		mCartItem = new CartItem[NUM_BOOK];
		mCartCount = 0;
	}
	public void printCart() {
		System.out.println("장바구니 상품 목록: ");
		System.out.println("=================================================");
		System.out.println("    도서ID \t:    수량 \t:    합계 \t:");
		
		for(int i = 0; i < mCartCount; i++) {
			System.out.print("    " + mCartItem[i].getBookID() + " \t: ");
			System.out.print("    " + mCartItem[i].getQuantity() + " \t: ");
			System.out.print("    " + mCartItem[i].getTotalPrice() + " \t: ");
			System.out.println("  ");
		}
		System.out.println("=================================================");
	}
	// 입력받은 bookId가 카트안에 들어있는 mCartItem와 일치하면 수량을 +1 해준다.
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		for(int i = 0; i < mCartCount; i++) {
			if (bookId.equals(mCartItem[i].getBookID())) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
				flag = true;
			}
		}
	return flag;
	}
	public void removeCart(int numId) {
		CartItem[] cartItem = new CartItem[NUM_BOOK];
		int num = 0;
		
		for (int i = 0; i < mCartCount; i++) {
			if (numId != i) {
				cartItem[num++] = mCartItem[i];
			}
		}
		mCartCount = num;
		mCartItem = cartItem;
	}

	@Override
	public boolean isCartBook(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
