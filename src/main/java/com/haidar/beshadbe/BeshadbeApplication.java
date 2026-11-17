package com.haidar.beshadbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BeshadbeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeshadbeApplication.class, args);
	}

}
