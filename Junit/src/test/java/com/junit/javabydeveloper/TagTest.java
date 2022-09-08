package com.junit.javabydeveloper;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Tag("Acceptance")
	@Test
	void acceptanceTest() {
		System.out.println("Acceptance Test");
	}

	@Tag("Accessibility")
	@Test
	void accessibilityTest() {
		System.out.println("Accessibility Test");
	}

	@Tag("Security")
	@Test
	void securityTest() {
		System.out.println("Security Test");
	}

	@Tag("Api")
	@Test
	void apiTest() {
		System.out.println("Api Test");
	}

	@Tag("Load")
	@Test
	void loadTest() {
		System.out.println("Load Test");
	}

	@Tag("Performance")	
	@Test
	void performanceTest() {
		System.out.println("Performance Test");
	}

}
