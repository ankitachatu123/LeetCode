package com.search.binary;

public class BinarySearchRecurssion {

	public static int binarySearch(int[] arr, int low, int high, int val) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == val) {
				return mid;
			}
			if (arr[mid] > val) 
				return binarySearch(arr, low, mid - 1, val);
				return binarySearch(arr, mid + 1, high, val);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 6, 7, 8, 9 };
		int val = 2;
		int res = binarySearch(arr, 0, arr.length - 1, val);
		System.out.println(res);
	}

}
