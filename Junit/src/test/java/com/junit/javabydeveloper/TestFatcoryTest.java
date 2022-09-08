package com.junit.javabydeveloper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.math.util.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import jodd.util.MathUtil;

public class TestFatcoryTest {

	@Test
	@Disabled("To Test Dynamic Test")
	public void addTest() {
		Assertions.assertEquals(25, MathUtils.addAndCheck(5, 20));
	}

	@Test
	@Disabled("To Test Dynamic Test")
	public void subtractTest() {
		Assertions.assertEquals(5, MathUtils.subAndCheck(25, 20));
	}

	@TestFactory
	DynamicTest dynamicTest() {
		return DynamicTest.dynamicTest("Single Dynamic Test",
				() -> Assertions.assertEquals(25, MathUtils.addAndCheck(5, 20)));

	}

	@TestFactory
	List<DynamicTest> dynamicTestFromList() {
		return Arrays.asList((DynamicTest.dynamicTest("1st List<DynamicTest>", () -> Assertions.assertEquals(25, 25))),
				DynamicTest.dynamicTest("2nd List<DynamicTest>", () -> Assertions.assertEquals(5, 5)));
	}

	@TestFactory
	DynamicContainer dynamicTestFromContainer() {
		return DynamicContainer.dynamicContainer("Dynamic Container",
				Stream.of(DynamicTest.dynamicTest("1st Dynamic Container", () -> Assertions.assertEquals(25, 25))));
	}

	@TestFactory
	Stream<DynamicNode> dynamicTestFromNode() {
		return Stream.of(7, 13)
				.map(number -> DynamicContainer.dynamicContainer("Even or Odd Test For " + number,
						Stream.of(DynamicTest.dynamicTest("Is Number " + number + " Odd ?",
								() -> Assertions.assertTrue(MathUtil.isOdd(number))))));
	}

}
