package com.bptn.course.throwable_throws_throw;

public class ThrowableExample {
	public void demonstrateThrowable() {
		int[] arr = {1,2,3,4};
		try {
			System.out.println(arr[4]);
		} catch (Throwable t) {
			System.out.println("Caught Throwable: " + t.getMessage());
		}
	}

	public static void main(String[] args) {
		ThrowableExample example = new ThrowableExample();
		example.demonstrateThrowable();
	}
}

