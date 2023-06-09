package com.lovetolearn.SpringBooApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBooApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringBooApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("in test class");
		assertEquals(true,true);
	}

}
