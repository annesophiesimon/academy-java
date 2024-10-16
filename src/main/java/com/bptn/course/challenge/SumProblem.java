package com.bptn.course.challenge;

import java.util.ArrayList;

public class SumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(2);
		grades.add(3);
		grades.add(4);
		ArrayList<Integer> result = new ArrayList<>();

		int target = 6;

		int index = 0;

		for (int i = 1; i < grades.size() - 1; i++) {
			while (!(grades.get(i) + grades.get(index) == target)) {
				index++;
			}
			result.add(i);
			result.add(index);

		}
		System.out.println(result);
	}
}
