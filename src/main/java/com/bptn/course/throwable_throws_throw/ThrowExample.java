package com.bptn.course.throwable_throws_throw;

public class ThrowExample {
	public void checkAge(int age) {
		if (age < 18) {
			// throwing an IllegalArgumentException if age is less than 18
			throw new IllegalArgumentException("Age must be at least 18.");
		}
		System.out.println("Age is valid:" + age);

	}
}
