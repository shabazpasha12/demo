package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	public static Logger logger = LogManager.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Cases Executing..............");
		assertEquals(true, true);
	}

}
