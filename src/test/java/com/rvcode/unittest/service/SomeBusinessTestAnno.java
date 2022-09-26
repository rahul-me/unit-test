package com.rvcode.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/*
 * Here with JUnit5 @ExtendWith have been used. To use Mockito we need to add extension.
 */
@ExtendWith(MockitoExtension.class)
public class SomeBusinessTestAnno {
	
	/*
	 * Here we don't need to instantiate, instantiation will automatically performed.
	 * @InjectMocks annotation will be used to find instances which requires injection, dependencies will be injected in that instances
	 * by finding @Mock annotations defined in the file
	 */
	@InjectMocks
	SomeBuisnessImpl business;
	
	@Mock
	DataService dataService;	

	@Test
	public void test_calculateSum() {
		when(dataService.getData()).thenReturn(new int[] { 1, 2, 3 });
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
