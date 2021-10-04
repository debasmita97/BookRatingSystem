package io.learning.Springbootms.bookratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.learning.Springbootms.bookratingdataservice.models.BookRating;
import io.learning.Springbootms.bookratingdataservice.models.UserBookRating;

@RestController
@RequestMapping("/bookratingsdata")
public class BookRatingResource {

	@RequestMapping("/{bookID}")
	public BookRating getRating(@PathVariable("bookID") String bookID) 
	{
		return new BookRating(bookID, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserBookRating getUserRating(@PathVariable("userId") String userId) 
	{
		List<BookRating> ratings = Arrays.asList(
				new BookRating("ABCD", 2),
				new BookRating("xyz", 5)
				);
		UserBookRating userBookRating = new UserBookRating();
		userBookRating.setUserBookRating(ratings);
		return  userBookRating;
	}
}
