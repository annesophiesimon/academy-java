package com.bptn.course._20_MultiThreading;

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * MyThread t1 = new MyThread(); Thread t2 = new Thread(new MyRunnable());
		 * 
		 * MyThread t3 = new MyThread();
		 * 
		 * t1.start(); t2.start();
		 * 
		 * t1.sleep(5000);
		 * 
		 * t1.join();
		 */

		// Create two SumCalculator threads to calculate the sum of two different ranges

		SumCalculator sumCalculator1 = new SumCalculator(1, 12000);
		SumCalculator sumCalculator2 = new SumCalculator(12001, 24000);

		// Start both threads

		long start = System.nanoTime();
		sumCalculator1.start();
		sumCalculator2.start();

		try { // Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join();
			sumCalculator2.join();
		} catch (InterruptedException e) { // Print the stack trace if an interruption occurs e.printStackTrace();
			e.printStackTrace();
		}
		long end = System.nanoTime();

		// Calculate the total sum by adding the sum of both ranges int totalSum =
		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();

		// Print the total sum
		System.out.println("Multi thread Total sum: " + totalSum + " duration " + (end - start) + " ns");

		int sum = 0;

		long start2 = System.nanoTime();

		for (int i = 1; i <= 24000; i++) {
			sum += i;
		}
		long end2 = System.nanoTime();

		System.out.println("normal loop: sum: " + sum + " duration: " + (end2 - start2) + " ns");

	}

}
