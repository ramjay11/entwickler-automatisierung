package com.ramjava.entwickler.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EntwicklerIntegrationApplication {

	// Ein Endpunkt wurde nur zu experimentellen Zwecken verfügbar gemacht
	@GetMapping
	public String nachricht() {
		return "Hallo";
	}

	public static void main(String[] args) {
		SpringApplication.run(EntwicklerIntegrationApplication.class, args);
	}

}
