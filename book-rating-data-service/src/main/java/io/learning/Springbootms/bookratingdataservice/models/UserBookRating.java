package io.learning.Springbootms.bookratingdataservice.models;

import java.util.List;


public class UserBookRating {
	
	private List<BookRating> userBookRating;

	public List<BookRating> getUserBookRating() {
		return userBookRating;
	}

	public void setUserBookRating(List<BookRating> userBookRating) {
		this.userBookRating = userBookRating;
	}

}
