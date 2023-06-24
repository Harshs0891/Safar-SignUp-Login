package com.example.finallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FinalloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalloginApplication.class, args);
	}

}
