package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class TimeoutDynamicTest {

	@TestFactory
	Collection<DynamicTest> timeoutInDynamicTest() {
		return Arrays.asList(DynamicTest.dynamicTest("First Timeout", () -> {
			assertTimeout(Duration.ofSeconds(5), () -> TimeUnit.SECONDS.sleep(5));
		}));
	}
}
