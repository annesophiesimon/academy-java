package com.bptn.course._23_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("student.txt");
			FileWriter writer2 = new FileWriter("sample.txt");

			writer.write("this is a new file \n");
			writer.write("My name is \n");
			writer.write("Sophie \n");
			writer.write("Simon \n");

			System.out.println("file created");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}

	}

}