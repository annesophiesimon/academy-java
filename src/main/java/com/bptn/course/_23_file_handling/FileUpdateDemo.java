package com.bptn.course._23_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

	public static void main(String[] args) {
		// append data

		try {
			// can add the entire path if we want to control the location of the file
			FileWriter writer = new FileWriter("student.txt", true);
			writer.write("this is a new Line /n");

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
