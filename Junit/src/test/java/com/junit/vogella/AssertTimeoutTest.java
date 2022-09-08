package com.junit.vogella;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class AssertTimeoutTest {

	@Test
	void timeOutTest() {
		assertTimeout(Duration.ofSeconds(3), () -> getValue());
	}

	String getValue() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		return "Time Not Exceeded";
	}

	@Test
	void timeNotExceededTest() {
		String result = assertTimeout(Duration.ofSeconds(3), () -> getValue());
		assertEquals("Time Not Exceeded", result);
	}
}
