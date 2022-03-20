package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Consumer code
public class RabbitMqClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqClientApplication.class, args);
	}

}
