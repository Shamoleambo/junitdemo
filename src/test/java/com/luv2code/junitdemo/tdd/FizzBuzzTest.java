package com.luv2code.junitdemo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

	@Test
	@DisplayName("Divisible by three")
	@Order(1)
	void testForDivisibleByThree() {
		String expected = "Fizz";
		assertEquals(expected, FizzBuzz.computer(3), "Should return Fizz");
	}
}
