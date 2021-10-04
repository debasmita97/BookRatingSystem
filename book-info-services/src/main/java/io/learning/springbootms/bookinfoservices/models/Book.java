package io.learning.springbootms.bookinfoservices.models;

public class Book {

	private String bookID;
	private String booknaame;
	
	public Book(String bookID, String booknaame) {
		
		this.bookID = bookID;
		this.booknaame = booknaame;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBooknaame() {
		return booknaame;
	}
	public void setBooknaame(String booknaame) {
		this.booknaame = booknaame;
	}
	
}
