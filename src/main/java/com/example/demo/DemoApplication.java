package com.example.demo;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger = LogManager.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started...........");
	}
	
	public static void main(String[] args) {
		logger.info("Application is Executing............");
		SpringApplication.run(DemoApplication.class, args);
	}

}
