package com.rvcode.unittest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListMockTest {
	List listMock = mock(List.class);
	
	@Test
	public void size_basic() {
		when(listMock.size()).thenReturn(5);
		assertEquals(5, listMock.size());
	}
	
	@Test
	public void size_return_different_values() {
		when(listMock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, listMock.size());
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void returnWithParameters() {
		when(listMock.get(0)).thenReturn(5).thenReturn(10);
		assertEquals(5, listMock.get(0));
		assertEquals(10, listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void returnOnlyOne() {
		when(listMock.get(anyInt())).thenReturn(5);
		assertEquals(5, listMock.get(0));
		assertEquals(5, listMock.get(0));
		assertEquals(5, listMock.get(1));
	}
}
