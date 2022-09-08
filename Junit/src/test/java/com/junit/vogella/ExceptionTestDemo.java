package com.junit.vogella;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionTestDemo {

	@Test
	void exceptionTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("One");
		}, "Number Format Exception is expected");
	}
}
