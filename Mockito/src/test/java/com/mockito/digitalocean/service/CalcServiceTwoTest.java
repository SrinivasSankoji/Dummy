package com.mockito.digitalocean.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalcServiceTwoTest {

	@InjectMocks
	CalcService calcService;

	@Mock
	AddService addService;

	@Test
	void calcTest() {
		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);
		int actual = calcService.calc(num1, num2);
		assertEquals(expected, actual);
	}
}
