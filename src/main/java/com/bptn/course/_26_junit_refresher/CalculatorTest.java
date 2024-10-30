package com.bptn.course._26_junit_refresher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// Initialise the object
	private Calculator myCal;
	int[] choice = { 1, 2, 3, 4, 5 };

	@BeforeEach
	void setUp() {
		myCal = new Calculator();
	}

	// Provide the data
	@Test
	void testAdd() {
		// Run the test -> compare against the expected output
		assertEquals(15, myCal.add(5, 10), "5 +10 should equal 15");
	}

	@Test
	void testSubtract() {
		assertEquals(10, myCal.subtract(5, 10), "5 -10 should equal -5");
	}

	@Test
	void testMultiply() {
		assertEquals(50, myCal.multiply(5, 10), "5 *10 should equal 50");
		assertEquals(40, myCal.multiply(8, 5), "5 *10 should equal 50");
		assertEquals(30, myCal.multiply(6, 5), "5 *10 should equal 50");
		assertEquals(20, myCal.multiply(5, 10), "5 *10 should equal 50");
	}

	@Test
	void testDivideByZero() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			myCal.divide(10, 0);
		});
		assertEquals("Cannot divide by zero.", exception.getMessage());
	}

}