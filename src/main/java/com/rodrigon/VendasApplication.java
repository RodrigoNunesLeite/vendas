package com.rodrigon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// indicando que essa classe é o start desse projeto spring
@SpringBootApplication
@RestController
public class VendasApplication {
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloWord() {
		return applicationName;
	}

	public static void main(String[] args) {
		
		// startando a aplicação
		SpringApplication.run(VendasApplication.class, args);
	}

}
