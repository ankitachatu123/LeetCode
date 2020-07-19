package com.search.binary;

public class BinarySearchOnRotatedArr {

	public static int findpivot(int[] arr, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[mid + 1] && mid < high) {
				return mid;
			}
			if (arr[mid] < arr[mid - 1] && low < mid) {
				return mid - 1;
			}
			if (arr[low] <= arr[mid])
				return findpivot(arr, mid + 1, high);
			return findpivot(arr, low, mid - 1);
		}
		return -1;
	}

	public static int searchVal(int[] arr, int val, int low, int high) {
		int index = findpivot(arr, low, high);
		if (arr[index] == val) {
			return index;
		}
		if (index == -1) {
			return binarySearch(arr, val, low, high);
		}
		if (arr[0] <= val)
			return binarySearch(arr, val, low, index - 1);
		return binarySearch(arr, val, index + 1, high);
	}

	public static int binarySearch(int[] arr, int val, int low, int high) {
		if (low > high) {
			return -1;

		}
		int mid = (low + high) / 2;
		if (arr[mid] == val) {
			return mid;
		}
		if (arr[mid] > val)
			return binarySearch(arr, val, low, mid - 1);
		return binarySearch(arr, val, mid + 1, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 9, 2, 4, 5, 6, 7 };
		int val = 7;
		int res = searchVal(arr, val, 0, arr.length - 1);
		System.out.println(res);
	}
}
