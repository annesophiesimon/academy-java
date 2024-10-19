package com.bptn.course._22_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] array) {
		int size = array.length;
		// outer loop for each index
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;

			}
			array[j + 1] = key;

		}
		// inner loop to compare and swap
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 5, 3, -1, 1, 10, 2 };
		System.out.println("before sort: " + Arrays.toString(data));
		InsertionSort.insertionSort(data);
		System.out.println("after sort: " + Arrays.toString(data));

	}

}
