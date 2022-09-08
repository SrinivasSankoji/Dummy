package com.junit.vogella;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GroupedAssertionsTest {

	@Test
	public void groupedTest() {
		assertAll("Grouped Assertions", 
				() -> assertEquals("Bhaumik", "Bhaumik"),
				() -> assertEquals("Aadvik", "Aadvik"));
	}
}
