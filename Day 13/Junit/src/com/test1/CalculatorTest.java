package com.test1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.Day13.Calculator;

public class CalculatorTest {
	int input1;
	int input2;
	static Calculator calc;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
		calc = new Calculator();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
		calc = null;
	}

	@Before
	public void previous() {
		System.out.println("Before");
		input1 = 10;
		input2 = 20;
	}

	@After
	public void next() {
		System.out.println("After");
		input1 = 0;
		input2 = 0;
	}

	@Test
	public void testAddition() {
		System.out.println("Test Addition");
		int actual = calc.addition(input1, input2);
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
		int actual = calc.subtraction(input1, input2);
		int expected = -10;
		assertEquals(expected, actual);
	}

}
