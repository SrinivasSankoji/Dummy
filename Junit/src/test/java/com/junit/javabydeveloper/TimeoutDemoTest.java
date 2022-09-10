package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TimeoutDemoTest {

	@Test
	void addTimeout() {
		assertTimeout(Duration.ofSeconds(5), () -> {
			TimeUnit.SECONDS.sleep(4);
			assertEquals(5, MathUtil.add(3, 2));
			System.out.println("addTimeout");
		});
	}

	@Test
	void multiplyTimeout() {
		assertTimeout(Duration.ofSeconds(5), () -> {
			TimeUnit.SECONDS.sleep(6);
			assertEquals(6, MathUtil.multiple(3, 2));
			System.out.println("multiplyTimeout");
		});
	}

	@Test
	void divideTimeout() {
		assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
			TimeUnit.SECONDS.sleep(6);
			assertEquals(2, MathUtil.devide(10, 5));
			System.out.println("divideTimeout");
		});
	}
}
