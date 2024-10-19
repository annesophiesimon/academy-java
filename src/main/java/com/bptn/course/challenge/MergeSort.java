package com.bptn.course.challenge;

import java.util.Arrays;

class MergeSort {

	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		// sort array
		mergeSort(arr, 0, arr.length - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	// Merges two subarrays of arr[].

	// First subarray is arr[l..m]

	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int r) {

	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int l, int r) {
		// Add code here
	}
}
