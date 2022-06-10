package com.prati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class OrderProductServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProductServiceAppApplication.class, args);
	}

}
