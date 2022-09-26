package com.rvcode.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplTestMock {
	DataService dataService = mock(DataService.class);
	SomeBuisnessImpl business = new SomeBuisnessImpl(dataService);
	
	
	@Test
	public void test_calculateSum() {
		when(dataService.getData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.calculateSumUsingExternalData());
	}

	@Test
	public void test_calculateSumWithStub() {
		when(dataService.getData()).thenReturn(new int[] { 1, 2, 3 });
		assertEquals(6, business.calculateSumUsingExternalData());
	}

	@Test
	public void test_calculateSum_empty() {
		when(dataService.getData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingExternalData());
	}
}
