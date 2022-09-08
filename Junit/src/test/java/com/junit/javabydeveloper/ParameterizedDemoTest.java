package com.junit.javabydeveloper;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedDemoTest {

	enum Role {
		ADMIN, SUBSCRIBER, OBSERVER, AUTHOR, PUBLISHER, ANONYMOUS
	}

	@ParameterizedTest(name = "{index}.testArrayWithParameters with value - {arguments} ")
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	void testArrayWithParameters(int arguments) {
		System.out.println("Parameterized Test with Integer Array " + arguments);
	}

	@ParameterizedTest(name = "{index} With String argument {0}")
	@ValueSource(strings = { "Peter King", "Arthur King", "Martin King" })
	void testWithStringParameters(String input) {
		String searchKey = "King";
		System.out.println("String Arguments :" + input);
		assertTrue(input.contains(searchKey));
	}

	@ParameterizedTest(name = "{index} Enum values are : {arguments}")
	@EnumSource(value = Role.class, names = { "ADMIN", "SUBSCRIBER" })
	void testWithEnumParameters(Role role) {
		assertNotNull(role);
	}

	@ParameterizedTest(name = "{index} Method Source with parameters {arguments}")
	@MethodSource("getNames")
	void testtestWithMethodSourceMethodSource(String arguments) {
		assertNotNull(arguments);
	}

	@ParameterizedTest(name = "{index} Method with Multiple Paraeters {arguments}")
	@MethodSource
	void stringIntAndListProvider(String str, int num, List<String> list) {
		System.out.println("str => " + str + "; num =>" + num + "; list => " + list);
		assertTrue(str.length() > 0);
		assertTrue(num >= 1 && num <= 3);
		assertTrue(!list.isEmpty());
	}

	@ParameterizedTest
	@CsvSource({ "Bhaumik,Chary,23", "Aadvik,Chary,15" })
	void testWithCSVSource(String firstName, String lastName, Integer dateOfBirth) {
		assertTrue(firstName != null);
		assertTrue(lastName != null);
		assertTrue(dateOfBirth > 0);
	}

	@ParameterizedTest(name = "{index}. Custom Argument Provider values {arguments}")
	@ArgumentsSource(CustomArgumentProvider.class)
	void testWithArgumentSource(String name, Integer date, List<?> details) {
		assertTrue(name != null);
		assertTrue(date > 0);
		assertTrue(!details.isEmpty());
	}

	@ParameterizedTest(name = "{index}. Implicit Conversion for Parameter {arguments}")
	@ValueSource(strings = { "2017-11-23", "2021-04-15" })
	void testWithImplicitConversion(LocalDate localDate) {
		System.out.println("Local Date " + localDate.toString());
		assertTrue(localDate != null);
	}

	@ParameterizedTest(name = "{index}.Explicit Conversion for parameters {arguments}")
	@ValueSource(strings = {"23-11-2107","15-04-2021"})
	void testWithExplicitConversion(@ConvertWith(DateConverter.class) LocalDate localDate) {
		System.out.println("Local Date " + localDate.toString());
		assertTrue(localDate != null);
	}

	static Stream<String> getNames() {
		return Stream.of("ADMIN", "SUBSCRIBER", "OBSERVER", "AUTHOR", "PUBLISHER", "ANONYMOUS");
	}

	static Stream<Arguments> stringIntAndListProvider() {
		return Stream.of(Arguments.arguments("Peter", 1, Arrays.asList("admin", "author")));
	}

}
