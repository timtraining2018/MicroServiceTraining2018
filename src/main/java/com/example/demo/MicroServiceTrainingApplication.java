package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication(scanBasePackages="com")
@ComponentScan(basePackages="com.*")
@EnableAutoConfiguration
public class MicroServiceTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceTrainingApplication.class, args);
	}
	


}

