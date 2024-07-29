package com.luv2code.junitdemo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

	@Test
	@DisplayName("Divisible by three")
	@Order(1)
	void testForDivisibleByThree() {
		String expected = "Fizz";
		assertEquals(expected, FizzBuzz.computer(3), "Should return Fizz");
	}

	@Test
	@DisplayName("Divisible by five")
	@Order(2)
	void testForDivisibleByFive() {
		String expected = "Buzz";
		assertEquals(expected, FizzBuzz.computer(5), "Should return Buzz");
	}

	@Test
	@DisplayName("Divisible by three and five")
	@Order(3)
	void testForDivisibleByThreeAndFive() {
		String expected = "FizzBuzz";
		assertEquals(expected, FizzBuzz.computer(15), "Should return FizzBuzz");
	}

	@Test
	@DisplayName("Not Divisible by three or five")
	@Order(4)
	void testForNotDivisibleByThreeOrFive() {
		String expected = "8";
		assertEquals(expected, FizzBuzz.computer(8), "Should return the given number");
	}

	@ParameterizedTest(name = "value={0}, expected={1}")
	@CsvFileSource(resources = "/test-data.csv")
	@DisplayName("Testing with small data file")
	@Order(5)
	void testWithSmallDataFile(int value, String expected) {
		assertEquals(expected, FizzBuzz.computer(value));
	}
}
