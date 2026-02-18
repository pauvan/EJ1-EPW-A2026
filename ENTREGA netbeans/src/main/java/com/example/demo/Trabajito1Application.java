package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication

public class Trabajito1Application {

	@RequestMapping("/")
	String home() {
	return "Hola NetBeans";
	}

	public static void main(String[] args) {
		SpringApplication.run(Trabajito1Application.class, args);
	}

}
