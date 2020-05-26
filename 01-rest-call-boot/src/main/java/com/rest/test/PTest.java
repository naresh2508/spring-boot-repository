package com.rest.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.rest.controller"})
public class PTest {

	public static void main(String[] args) {

		SpringApplication.run(PTest.class, args);
	}

}
