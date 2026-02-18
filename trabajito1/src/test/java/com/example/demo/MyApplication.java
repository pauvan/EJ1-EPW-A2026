package com.example.demo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

@SpringBootTest


public class MyApplication {

	@RequestMapping("/")
	String home() {
	return "Hello World! Spring Boot 4 está aquí.";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
