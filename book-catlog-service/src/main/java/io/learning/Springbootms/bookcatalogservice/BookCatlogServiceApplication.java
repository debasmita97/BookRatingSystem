package io.learning.Springbootms.bookcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class BookCatlogServiceApplication {

	
	@Bean
	public RestTemplate getRestTemplate()
	{
		HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory= new HttpComponentsClientHttpRequestFactory();
		httpComponentsClientHttpRequestFactory.setConnectTimeout(3000);
		return new RestTemplate(httpComponentsClientHttpRequestFactory);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookCatlogServiceApplication.class, args);
	}

}
