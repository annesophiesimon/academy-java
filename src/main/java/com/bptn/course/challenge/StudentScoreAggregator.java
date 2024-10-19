package com.bptn.course.challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAggregator {

	public static double calculateAverage(Student student, Map<String, Double> scores) {
		double avg = 0;
		double sum = 0;
		for (Double score : scores.values()) {
			sum += score;

		}
		avg = sum / scores.size();
		return avg;

	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("Math", 90.87);
		scores.put("Frencg", 89.8);
		scores.put("English", 67.9);

		Student s1 = new Student("Student one", scores);

		System.out.println(String.format("The average score is: %.2f", calculateAverage(s1, scores)));

	}
}
