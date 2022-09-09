package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void windowsOSTset() {
		assertTrue(System.getProperty("os.name").equalsIgnoreCase("Windows 10"));
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void linuxOSTset() {
		assertTrue(System.getProperty("os.name").equalsIgnoreCase("Linux"));
	}

	@Test
	@EnabledOnJre(JRE.JAVA_11)
	void java11Test() {
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.runtime.version"));
		assertTrue(System.getProperty("java.runtime.version").contains("11.0.4"));
	}

	@Test
	@Disabled("Enable the Test to see the System Properties")
	void getAllSystemProperties() {
		System.getProperties().forEach((key, value) -> System.out.println(key + " - " + value));
	}

	@Test
	@EnabledIfSystemProperty(named = "os.name", matches = "Windows 10")
	void runOnWindowsOS() {
		assertTrue(System.getProperty("os.name").equalsIgnoreCase("Windows 10"));
	}

	@Test
	void getAllSystemEnvironment() {
		System.getenv().forEach((key, value) -> System.out.println(key + " - " + value));
	}

	@Test
	@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "DELL")
	void runIfUserIsDell() {
		assertTrue(System.getenv("USERNAME").equalsIgnoreCase("DELL"));
	}

	@Test
	@RunOnlyOnWindows10
	void runOnWindows10() {
		assertTrue(System.getProperty("os.name").equalsIgnoreCase("Windows 10"));
	}
}
