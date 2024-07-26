package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {

	DemoUtils sut;

	@BeforeEach
	public void setupBeforeEach() {
		this.sut = new DemoUtils();
	}

	@Test
	@DisplayName("Equals and Not Equals")
	public void testEqualsAndNotEquals() {
		DemoUtils sut = new DemoUtils();

		assertEquals(6, sut.add(3, 3), "3 + 3 must be 6");
		assertNotEquals(6, sut.add(1, 1), "1 + 1 must be 2");
	}

	@Test
	@DisplayName("Null and Not Null")
	public void testNullAndNotNull() {
		DemoUtils sut = new DemoUtils();

		String isNull = null;
		String notNull = "not null";

		assertNull(sut.checkNull(isNull), "Object should be null");
		assertNotNull(sut.checkNull(notNull), "Object should not be null");
	}

	@Test
	@DisplayName("Same and Not Same")
	void testSameAndNotSame() {
		String str = "luv2code";

		assertSame(sut.getAcademy(), sut.getAcademyDuplicate(), "Objects should refer to the same object");
		assertNotSame(str, sut.getAcademy(), "Objects should not refer to the same object");
	}

	@Test
	@DisplayName("True False")
	void testTrueFalse() {
		int num1 = 3;
		int num2 = 5;
		int num3 = 1;

		assertTrue(this.sut.isGreater(num2, num1));
		assertFalse(this.sut.isGreater(num3, num2));
	}

	@Test
	@DisplayName("Array Equals")
	void testArrayEquals() {
		String[] strArr = { "A", "B", "C" };

		assertArrayEquals(strArr, this.sut.getFirstThreeLettersOfAlphabet());
	}
}
