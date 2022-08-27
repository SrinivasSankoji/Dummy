package com.junit.softwaretestinghelp;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCaseOne.class, TestCaseTwo.class })
public class TestSuiteDemo {

	/**
	 * Test Case using JUnit4 
	 */
	@BeforeClass
	public static void runJunitTestSuite() {
		System.out.println("Running Junit Test Suite for Test Cases TestCaseOne and TestCaseTwo");
	}
}
