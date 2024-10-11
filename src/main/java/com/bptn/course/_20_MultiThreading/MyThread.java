package com.bptn.course._20_MultiThreading;

public class MyThread extends Thread {

// Trigger runing of the thread 	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}
	}

}
