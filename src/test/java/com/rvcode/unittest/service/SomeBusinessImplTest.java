package com.rvcode.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rvcode.unittest.service.SomeBuisnessImpl;

public class SomeBusinessImplTest {
	@Test
	public void test_calculateSum() {
		SomeBuisnessImpl business = new SomeBuisnessImpl();
		int outputSum = business.calculateSum(new int[] {1,2,3});
		assertEquals(outputSum, 6);
	}
	
	@Test
	public void test_calculateSumForEmptyArray() {
		SomeBuisnessImpl business = new SomeBuisnessImpl();
		int actualOutput = business.calculateSum(new int[] {});
		int expectedOutput = 0;
		assertEquals(actualOutput, expectedOutput);
	}
}
