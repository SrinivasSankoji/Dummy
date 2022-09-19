package com.mockito.digitalocean.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalcServiceOneTest {

	@Test
	void calcTest() {
		CalcService calcService;
		AddService addService;

		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);
		int actual = calcService.calc(num1, num2);
		assertEquals(expected, actual);
	}
}
