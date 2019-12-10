package com.bkotharu.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point for a Spring Boot Application
 * 
 * @author bhargavakotharu
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.bkotharu.hexagonal")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
