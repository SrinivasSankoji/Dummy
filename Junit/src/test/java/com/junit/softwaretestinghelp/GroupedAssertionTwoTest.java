package com.junit.softwaretestinghelp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class GroupedAssertionTwoTest {

	@Test
	public void nestedGroupedAssertionTest() {
		Employee employee = new Employee("Bhaumik", 23);

		assertAll("Grouped Assertions", () -> {

			assertNotNull(employee.getEname());

			assertAll("Nested Assertions", () -> {
				assertEquals(employee.getEmpcode(), 21);
			});
		});
	}
}
