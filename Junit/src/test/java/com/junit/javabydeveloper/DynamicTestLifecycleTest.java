package com.junit.javabydeveloper;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestLifecycleTest {

	@BeforeEach
	public void setUp() {
		System.out.println("Before Class Execution");
	}

	@TestFactory
	List<DynamicTest> dynamicTestFromList() {
		return Arrays.asList(DynamicTest.dynamicTest("First Dynamic Test", () -> assertTrue(true)),
				DynamicTest.dynamicTest("Second Dynamic Test", () -> assertTrue(true)));
	}

	@AfterEach
	public void tearDown() {
		System.out.println("After Class Execution");
	}

}
