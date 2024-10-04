package com.bptn.course.throwable_throws_throw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
	 public void readFile(String filePath) throws IOException {
	     BufferedReader reader = new BufferedReader(new FileReader(filePath));
	     String line = reader.readLine();
	     System.out.println("First line of the file: " + line);
	     reader.close();
	 }
}


