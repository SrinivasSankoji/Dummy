package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
public class DisplayNameTest {

	@Test
	@DisplayName("Test case for Addition")
	void addTest() {
		assertEquals(20, MathUtil.add(10, 10));
	}
	
	@Test
	void multiplyTest() {
		assertEquals(20, MathUtil.multiple(4, 5));
	}
}
