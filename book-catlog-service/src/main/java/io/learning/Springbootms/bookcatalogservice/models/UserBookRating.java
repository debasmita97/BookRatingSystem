package io.learning.Springbootms.bookcatalogservice.models;


import java.util.List;


public class UserBookRating {

	private List<BookRating> userBookRating;

	public List<BookRating> getUserBookRating() {
		return userBookRating;
	}

	public void setUserBookRating(List<BookRating> userbookRating) {
		this.userBookRating = userBookRating;
	}
}
