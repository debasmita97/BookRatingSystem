package io.learning.springbootms.bookinfoservices.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.learning.springbootms.bookinfoservices.models.Book;

@RestController
@RequestMapping("/books")
public class BookResource {
	@RequestMapping("/{bookID}")
	public Book getBookInfo(@PathVariable ("bookID") String bookID)
	{
		return new Book("bookID", "TestName");
	}

}
