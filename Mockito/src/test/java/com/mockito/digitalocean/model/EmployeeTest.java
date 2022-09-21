package com.mockito.digitalocean.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeeTest {

	@Mock
	Employee employee;

	@Test
	void mockitoDoAnswerTest() {
		doAnswer((i) -> {
			System.out.println("Employee Name is " + i.getArgument(0));
			assertTrue("Bhaumik".equals(i.getArgument(0)));
			return null;
		}).when(employee).setName(ArgumentMatchers.anyString());
		employee.setName("Bhaumik");
	}

	@Test
	void mockitoDoThrowTest() {
		doThrow(IllegalArgumentException.class).when(employee).setName(ArgumentMatchers.anyString());
		assertThrows(IllegalArgumentException.class, () -> employee.setName(null));
	}

	@Test
	void mockitoDoNothingTest() {
		doNothing().when(employee).setName(ArgumentMatchers.anyString());
		employee.setName(null);
	}
	
	@Test
	void mockitoCallRealMethodTest() {
		doCallRealMethod().when(employee).setName(ArgumentMatchers.anyString());
		employee.setName("Bhaumik");
	}

}
