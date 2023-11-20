package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que marca a classe como uma aplicação Spring Boot.
@SpringBootApplication
public class DemoApplication {

	// Ponto de entrada da aplicação Spring Boot.
	public static void main(String[] args) {
		// Inicializa e executa a aplicação Spring Boot.
		SpringApplication.run(DemoApplication.class, args);
	}

}
