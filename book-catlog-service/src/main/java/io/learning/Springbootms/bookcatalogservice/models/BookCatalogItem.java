package io.learning.Springbootms.bookcatalogservice.models;

public class BookCatalogItem {

	private String bookName;
	private String BbookDescription;
	private int bookRatings;
	
	public BookCatalogItem(String bookName, String bbookDescription, int bookRatings) {
		this.bookName = bookName;
		BbookDescription = bbookDescription;
		this.bookRatings = bookRatings;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBbookDescription() {
		return BbookDescription;
	}

	public void setBbookDescription(String bbookDescription) {
		BbookDescription = bbookDescription;
	}

	public int getBookRatings() {
		return bookRatings;
	}

	public void setBookRatings(int bookRatings) {
		this.bookRatings = bookRatings;
	}

	
	
	
}
