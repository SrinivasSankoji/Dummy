package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestInstanceTest {

	private int result = 5;

	@BeforeAll
	static void beforeAll() {
		System.out.println("--- Before starting tests --- ");
	}

	@Test
	void addTest() {
		result = MathUtil.add(result, 5);
		System.out.println("addTest(5,5) => " + result);
		assertEquals(10, result);
	}

	@Test
	void multiplyTest() {
		result = MathUtil.multiple(result, 5);
		System.out.println("multiplyTest(5,5) => " + result);
		assertEquals(25, result);
	}

	@Test
	void divideTest() {
		result = MathUtil.devide(result, 5);
		System.out.println("divideTest(5,5) => " + result);
		assertEquals(1, result);
	}
}
