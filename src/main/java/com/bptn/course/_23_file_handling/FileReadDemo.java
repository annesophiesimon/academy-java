package com.bptn.course._23_file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("student.txt");
			BufferedReader bufferredReader = new BufferedReader(reader);
			String line;
			while ((line = bufferredReader.readLine()) != null) {
				System.out.println(line);

			}

		} catch (IOException e) {
			System.out.println("Something went wrong" + e.getMessage());
			e.printStackTrace();
		}

	}
}