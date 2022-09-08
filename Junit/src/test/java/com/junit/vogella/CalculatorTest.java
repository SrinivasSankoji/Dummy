package com.junit.vogella;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		calculator = new Calculator();
		System.setProperty("ENV", "PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), CalculatorTest::message);
		assertEquals(50, calculator.multiply(10, 5), "10*5 must be 50");
	}

	@RepeatedTest(5)
	@DisplayName("Ensure correct handling of zero")
	void testMultiplyWithZero() {
		assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
		assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
	}

	private static String message() {
		return "TEST Execution Failed :: ";
	}

}
