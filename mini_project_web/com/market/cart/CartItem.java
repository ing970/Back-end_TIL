package ch_6.com.market.cart;

import ch_6.com.market.bookitem.Book;


public class CartItem {
	// 장바구니에 담은 책 1권 정보
	// private String[] itemBook = new String[7];
	
	// 장바구니 담은 책 정보
	private Book itemBook;
	// 장바구니에 담은 책 ISBN.
	private String bookID;
	// 장바구니에 담은 책 개수
	private int quantity;
	// 장바구니에 담은 책 가격(단가 * 권수)
	private int totalPrice;
	
	// 입력값 없는 생성자
	public CartItem() {
		
	}
	public CartItem(Book booklist) {
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.quantity = 1;
		updateTotalPrice();
	}
	public Book getItemBook() {return itemBook;}
	public void setItemBook(Book itemBook) {this.itemBook = itemBook;}
	
	public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}
	
	public String getBookID() {return bookID;}
	public void setBookID(String bookID) {
		// 매개변수와 필드 이름이 bookID로 같다
		// 필드: this.bookID
		// 매개변수: bookID
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	public int getQuantity() {return quantity;}
	public void setQuantity(int quantity) {
     	// 매개변수이름과 필드 이름 같음
		// 필드: this.quantity
		// 매개변수: quantity
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	public int getTotalPrice() {return totalPrice;}
	public void updateTotalPrice() {
		totalPrice = this.itemBook.getUnitPrice() * this.quantity;
	}

}
