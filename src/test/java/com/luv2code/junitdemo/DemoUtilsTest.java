package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class DemoUtilsTest {

	DemoUtils sut;

	@BeforeEach
	public void setupBeforeEach() {
		this.sut = new DemoUtils();
	}

	@Test
	public void testEqualsAndNotEquals() {
		DemoUtils sut = new DemoUtils();

		assertEquals(6, sut.add(3, 3), "3 + 3 must be 6");
		assertNotEquals(6, sut.add(1, 1), "1 + 1 must be 2");
	}

	@Test
	public void testNullAndNotNull() {
		DemoUtils sut = new DemoUtils();

		String isNull = null;
		String notNull = "not null";

		assertNull(sut.checkNull(isNull), "Object should be null");
		assertNotNull(sut.checkNull(notNull), "Object should not be null");
	}
}
