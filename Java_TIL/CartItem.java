
public class CartItem {
	// 장바구니에 담은 책 1권 정보
	private String[] itemBook = new String[7];
	// 장바구니에 담은 책 ISBN.
	private String bookID;
	// 장바구니에 담은 책 개수
	private int quantity;
	// 장바구니에 담은 책 가격(단가 * 가격)
	private int totalPrice;
	
	
	public CartItem() {
		
	}
	// 매개변수 book: 장바구니 담은 책 1종류의 정보.
	public CartItem(String[] book) {
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;
		updateTotalPrice();
	}
	// 책정보 리턴
	public String toStr() {
		return "CartItem[bookID = " + bookID + ", quantity = " + quantity
				+ ", totlaPrice = " + totalPrice + "]";
	}
	public String[] getItemBook() {
		return itemBook;
	}
	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
	}
	
	
	public static void main(String[] args) {
		String[] cbook = new String[3]; 
		cbook[0] = "ISBN1234"; cbook[1] = "JSP 30일 완성!!";cbook[2] = "330000";
		
		//CartItem 객체 생성
		CartItem citem = new CartItem(cbook); // 인턴스변수 생성 // 생성자 호
		System.out.println("citem.toStr() = " + citem.toStr());

	}

}
