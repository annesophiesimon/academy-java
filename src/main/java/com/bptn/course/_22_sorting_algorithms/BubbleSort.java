package com.bptn.course._22_sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {

		int size = array.length;

		// loop for every array element
		for (int i = 0; i < size - 1; i++) {

			// loop for comparison
			for (int j = 0; j < size - 1; j++) {

				// comparison

				// if value on right is less than value on left we swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 5, 3, -1, 1, 10, 2 };
		System.out.println("before sort: " + Arrays.toString(data));
		BubbleSort.bubbleSort(data);
		System.out.println("after sort: " + Arrays.toString(data));

	}

}
