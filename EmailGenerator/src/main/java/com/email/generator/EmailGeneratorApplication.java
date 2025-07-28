package com.email.generator;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailGeneratorApplication.class, args);
	}

}
