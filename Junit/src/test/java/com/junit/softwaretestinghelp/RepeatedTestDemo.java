package com.junit.softwaretestinghelp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestDemo {

	@DisplayName("Test case for Multiplication")
	@RepeatedTest(value = 5)
	void multiply(TestInfo testInfo) {
		int a = 10;
		int b = 20;
		assertEquals(200, (a * b), "Matched. Test status - Passed");
	}
}
