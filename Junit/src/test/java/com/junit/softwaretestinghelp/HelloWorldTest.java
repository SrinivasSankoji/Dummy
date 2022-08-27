package com.junit.softwaretestinghelp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.junit.softwaretestinghelp.HelloWorld;

@TestInstance(Lifecycle.PER_CLASS)
public class HelloWorldTest {

	HelloWorld helloWorld=null;
	
	@BeforeAll
	void setUp()
	{
		System.out.println("Object Created Only Once");
		helloWorld=new HelloWorld();
	}
	
	@Test
	@Disabled
	public void test() {
		assertEquals("Hello world", "Hello world");
	}

	@Test
	public void testHelloWorld() {
		helloWorld = new HelloWorld("Hello world");
		assertEquals(helloWorld.getMessage(), "Hello world");
	}
}
