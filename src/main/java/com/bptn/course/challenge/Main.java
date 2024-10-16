package com.bptn.course.challenge;

import java.util.Arrays;

public class Main {

	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 10;

		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println(array.toString());

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				low = mid + 1;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}
}