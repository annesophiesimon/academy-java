package com.bptn.course._09_inheritance;

public class MathUtil {
	
	// static dataType propertyName;
	 static double valueOfPi = 3.14;
	 static int count;
	 
	// static returnType methodName;
	 static int add(int a, int b) {
	  return a + b;
	 }
	 
	 static int count() {
		  return count++;
	 }
	 
	 public void displayData() {
	  System.out.print("This is not static");
	 }

}
