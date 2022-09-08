package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.util.MathUtils;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExecutionOrderDynamicTest {

	@TestFactory
	Collection<DynamicTest> executionOrderInDynamicTest() {
		List<DynamicTest> dynamicTests = Arrays.asList(
				DynamicTest.dynamicTest("First Dynamic Test", () -> assertEquals(6, MathUtils.addAndCheck(2, 4))),
				DynamicTest.dynamicTest("Second Dynamic Test", () -> assertEquals(6, MathUtils.addAndCheck(2, 4))),
				DynamicTest.dynamicTest("Third Dynamic Test", () -> assertEquals(6, MathUtils.addAndCheck(2, 4))));
		sortDynamicTests(dynamicTests);
		return dynamicTests;
	}

	static void sortDynamicTests(List<DynamicTest> dynamicTests) {
		dynamicTests.sort((DynamicTest d1, DynamicTest d2) -> d2.getDisplayName().compareTo(d1.getDisplayName()));
	}

}
