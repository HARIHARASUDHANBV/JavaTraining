package com.test1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Day13.Factorial;

public class FactorialTest {

	@Test
	public void testFact() {
		Factorial fact=new Factorial();
		int actual=fact.fact(5);
		int expected=120;
		assertEquals(expected, actual);
	}

}
