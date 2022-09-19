package com.mockito.digitalocean.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class VerifyInteractionTest {

	@SuppressWarnings("unchecked")
	List<String> mockedList = Mockito.mock(List.class);

	@Test
	public void testVerify() {

		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		mockedList.clear();

		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList, VerificationModeFactory.times(2)).add("third-element");

		verify(mockedList).clear();
	}

	@Test
	void testStub() {
		when(mockedList.get(0)).thenReturn("first-element");
		System.out.println(mockedList.get(0));
		assertEquals(mockedList.get(0), "first-element");
		System.out.println(mockedList.get(1));
	}

	@Test
	void testSpy() {
		List<String> list = new ArrayList<>();
		List<String> listSpy = spy(list);

		listSpy.add("spy-element");
		System.out.println(listSpy.get(0));
		assertEquals("spy-element", listSpy.get(0));
		
		when(listSpy.get(0)).thenReturn("second-element");
		assertEquals("second-element", listSpy.get(0));
	}
}
