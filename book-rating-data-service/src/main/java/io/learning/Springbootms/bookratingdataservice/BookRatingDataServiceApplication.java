package io.learning.Springbootms.bookratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookRatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRatingDataServiceApplication.class, args);
	}

}
