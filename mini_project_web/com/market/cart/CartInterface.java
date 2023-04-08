package ch_6.com.market.cart;

import ch_6.com.market.bookitem.Book;

public interface CartInterface {
	void printBookList(Book[] p);
	boolean isCartBook(String id);
	void insertBook(Book p);
	void removeCart(int numId);
	void deleteBook();
	
}
