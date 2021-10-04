package io.learning.Springbootms.bookcatalogservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.learning.Springbootms.bookcatalogservice.models.Book;
import io.learning.Springbootms.bookcatalogservice.models.BookCatalogItem;
import io.learning.Springbootms.bookcatalogservice.models.UserBookRating;

@RestController
@RequestMapping("/catalog")
public class BookCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
//	@Autowired
//	private DiscoveryClient discoveryClient;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@RequestMapping("{userId}")
	public List<BookCatalogItem> getCatalog(@PathVariable("userId") String userID)
	{
	     //RestTemplate restTemplate = new RestTemplate();
	     
	     //WebClient.Builder builder = WebClient.builder();
       	 UserBookRating userBookRatings = restTemplate.getForObject("http://localhost:8086/bookratingsdata/users/"+ userID, UserBookRating.class);
       	 
       	 
//       	 return userBookRatings.getUserBookRating().stream().map(rating-> {
//     		//For each movie ID, call movie info service and get details
//
//       		 Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+ rating.getRating(),  Movie.class);
//       		 /*Movie movie = webClientBuilder.build()
//       		 .get()
//       		 .uri("http://localhost:8082/movies/"+ rating.getRating())
//       		 .retrieve()
//       		 .bodyToMono(Movie.class)
//       		 .block(); */
//       		 return new CatalogItem(movie.getName(),"Test" , rating.getRating());
//       	})
//       			 .collect(Collectors.toList());  	 
//       	 
		return userBookRatings.getUserBookRating().stream().map(bookRating->{
			Book book = restTemplate.getForObject("http://localhost:8084/books/"+ bookRating.getBookRating(),  Book.class);
			
			return new BookCatalogItem(book.getBooknaame(), "Test", bookRating.getBookRating());
		}).collect(Collectors.toList());
		//Put them all together
		
			}

}
