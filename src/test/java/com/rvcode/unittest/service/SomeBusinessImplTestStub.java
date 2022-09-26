package com.rvcode.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DataServiceStub implements DataService {

	@Override
	public int[] getData() {
		return new int[] {1,2,3};
	}
	
}

public class SomeBusinessImplTestStub {
	@Test
	public void test_calculateSum() {
		SomeBuisnessImpl business = new SomeBuisnessImpl(new DataService() {
			
			@Override
			public int[] getData() {
				return new int[] {1,2,3};
			}
		});
		
		int outputSum = business.calculateSumUsingExternalData();
		assertEquals(outputSum, 6);
	}
	
	@Test
	public void test_calculateSumWithStub() {
		SomeBuisnessImpl business = new SomeBuisnessImpl(new DataServiceStub());
		int outputSum = business.calculateSumUsingExternalData();
		assertEquals(outputSum, 6);
	}
	
	@Test
	public void test_calculateSumWithStub_lambda() {
		SomeBuisnessImpl business = new SomeBuisnessImpl(() -> new int[] {1,2,3});
		int outputSum = business.calculateSumUsingExternalData();
		assertEquals(outputSum, 6);
	}
	
}
