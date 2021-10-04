package io.learning.Springbootms.bookcatalogservice.models;

public class BookRating {

	private String bookID;
	private int bookRating;
	public BookRating(String bookID, int bookRating) {
		
		this.bookID = bookID;
		this.bookRating = bookRating;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getBookRating() {
		return bookRating;
	}
	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}
}
