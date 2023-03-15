package com.mockito.digitalocean.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FooTest {

	@Mock
	Foo mockFoo;

	/**
	 * Argument Matchers with Any Method
	 */
	@Test
	public void boolAnyTest() {
		when(mockFoo.bool(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt(), ArgumentMatchers.any()))
				.thenReturn(true);
		assertTrue(mockFoo.bool("A", 1, "A"));
		assertTrue(mockFoo.bool("B", 10, new Object()));
	}

	/**
	 * Argument Matchers with equals()
	 */
	@Test
	public void boolEqualsTest() {
		when(mockFoo.bool(ArgumentMatchers.eq("false"), ArgumentMatchers.anyInt(), ArgumentMatchers.any()))
				.thenReturn(true);
		assertTrue(mockFoo.bool("false", 1, "A"));
	}

}
