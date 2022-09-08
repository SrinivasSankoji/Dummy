package com.junit.softwaretestinghelp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GroupedAssertionOneTest {

	@Test
	public void groupedAssertionTest() {
		float a = (float) 1.2;
		float b = (float) 1.3;
		float delta = (float) 1.0;
		assertAll(() -> assertEquals(a, b, "Assert with Delta"));
	}
}
