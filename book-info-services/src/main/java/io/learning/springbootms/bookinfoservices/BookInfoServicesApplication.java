package io.learning.springbootms.bookinfoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookInfoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoServicesApplication.class, args);
	}

}
