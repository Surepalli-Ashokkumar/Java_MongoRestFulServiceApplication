package com.cisco.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cisco.demo")
public class MongoRestFulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRestFulServiceApplication.class, args);
	}

}
