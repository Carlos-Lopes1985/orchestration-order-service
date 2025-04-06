package com.orchestation_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.orchestation_order_service.client")
public class OrchestationOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestationOrderServiceApplication.class, args);
	}

}
