package com.sekhmet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SekhmetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SekhmetApplication.class, args);
	}

}
