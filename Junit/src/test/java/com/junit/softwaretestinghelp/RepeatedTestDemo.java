package com.junit.softwaretestinghelp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

import com.junit.javabydeveloper.MathUtil;

public class RepeatedTestDemo {

	@DisplayName("Test case for Multiplication")
	@RepeatedTest(value = 5,name = RepeatedTest.LONG_DISPLAY_NAME)
	void multiply(TestInfo testInfo) {
		int a = 10;
		int b = 20;
		assertEquals(200, (a * b), "Matched. Test status - Passed");
	}
	
	 @RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	 @DisplayName("Test case for Division")
	  void divideTest() {
	    System.out.println("divideTest()");
	    assertEquals(5, MathUtil.devide(25, 5));
	  }
}
