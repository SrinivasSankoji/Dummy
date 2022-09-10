package com.junit.softwaretestinghelp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestInterfaceDemo {

	@RepeatedTest(value = 2,name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Interface Methods")
	@Tag("Annotations")
	public void interfaceDemo(TestInfo testInfo,RepetitionInfo repetitionInfo,RepeatedTest repeatedTest)
	{
		System.out.println("TestInfo Details");
		System.out.println("TestInfo :"+testInfo.getDisplayName());
		System.out.println("TestInfo :"+testInfo.getTags());
		System.out.println("TestInfo :"+testInfo.getTestMethod().get().getName());
		
		System.out.println("***Repetition Details***");
	    System.out.println("Current Repetition:" + repetitionInfo.getCurrentRepetition());
	    System.out.println("Total Repetitions:" + repetitionInfo.getTotalRepetitions());
	 
	    System.out.println("***Annotation Details***");
	             System.out.println("Name value of @RepeatedTest annotation:" + repeatedTest.name());
	    System.out.println("Value of @RepeatedTest annotation:" + repeatedTest.value());
	}
}
