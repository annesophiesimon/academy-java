package com.bptn.course._25_file_utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {

	public boolean isFileExist(Path path) {
		System.out.println(path);
		if (Files.exists(path)) {
			System.out.println("File exists!");
			return true;
		}
		System.out.println("File doesn't exist!");
		return false;
	}

	public boolean isFileExistsWithExceptionHandling(Path path) {

		File file = new File(path.toUri());

		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.nextLine();
			System.out.println("File exists");
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
			return false;
		}

		return true;
	}

	public boolean createFileIfNotExist(Path path) {
		if (!Files.exists(path)) {

			try {
				Files.createFile(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
		}
		return true;
	}

	public void readFile(Path path) {
		if (isFileExist(path)) {
			try {
				Scanner scanner = new Scanner(new File(path.toUri()));
				while (scanner.hasNextLine()) {
					String data = scanner.nextLine();
					System.out.println(data);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void deleteFile(Path path) {
	    if (isFileExist(path)) {
	        try {
	            Files.delete(path);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	public void writeFile(Path path) {
		if (isFileExist(path)) {
			try {
				FileWriter writer = new FileWriter(new File(path.toUri()));
				writer.write("text 4 n");
				writer.write("text 5 n");

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void updateFile(Path path) {

		if (isFileExist(path)) {
			try (FileWriter writer = new FileWriter(new File(path.toUri()), true)) {
				writer.write("text 6 n");
				writer.write("text 7 n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		FileUtils fileUtils = new FileUtils();

		String DIRECTORY_PATH = System.getProperty("user.dir") + "/";

		String filePath = DIRECTORY_PATH + "test.txt";

		System.out.println(filePath);

		fileUtils.writeFile(Paths.get(filePath));
		fileUtils.updateFile(Paths.get(filePath));
		fileUtils.readFile(Paths.get(filePath));
		fileUtils.deleteFile(Paths.get(filePath));
	}

}
