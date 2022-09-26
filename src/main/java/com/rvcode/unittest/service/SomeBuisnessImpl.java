package com.rvcode.unittest.service;

public class SomeBuisnessImpl {
	
	private DataService dataService;
	
	
	public SomeBuisnessImpl(DataService dataService) {
		this.dataService = dataService;
	}
	
	public SomeBuisnessImpl() {}


	public int calculateSum(int[] arr) {
		int sum = 0;
		int size = arr.length;
		while((size--) > 0) {
			sum+=arr[size];
		}
		return sum;
	}
	
	public int calculateSumUsingExternalData() {
		int[] arr = dataService.getData();
		int sum = 0;
		int size = arr.length;
		while((size--) > 0) {
			sum+=arr[size];
		}
		return sum;
	}
}
