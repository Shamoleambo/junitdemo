package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {

	DemoUtils sut;

	@BeforeEach
	public void setupBeforeEach() {
		this.sut = new DemoUtils();
		System.out.println("@BeforeEach execute before the execution of each test");
	}

	@AfterEach
	void tearDownAfterEach() {
		System.out.println("Running @AfterEach");
		System.out.println();
	}

	@BeforeAll
	static void setupBeforeAll() {
		System.out.println("@BeforeAll running");
	}

	@AfterAll
	static void tearDownAfterAll() {
		System.out.println("Running @AfterAll");
	}

	@Test
	public void testEqualsAndNotEquals() {
		System.out.println("Running test: testEqualsAndNotEquals");

		DemoUtils sut = new DemoUtils();

		assertEquals(6, sut.add(3, 3), "3 + 3 must be 6");
		assertNotEquals(6, sut.add(1, 1), "1 + 1 must be 2");
	}

	@Test
	public void testNullAndNotNull() {
		System.out.println("Running test: testNullAndNotNull");

		DemoUtils sut = new DemoUtils();

		String isNull = null;
		String notNull = "not null";

		assertNull(sut.checkNull(isNull), "Object should be null");
		assertNotNull(sut.checkNull(notNull), "Object should not be null");
	}
}
