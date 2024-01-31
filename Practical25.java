package com.oops_concepts.java;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * This program demonstrates file handling by reading and printing the contents
 * of a file. It reads from a file named "myTestFile.txt" and processes each
 * line using the processLine method.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical25 {

	public static void main(String[] args) {
		// File name
		String fileName = "myTestFile.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;

			// Reading data from the file using a loop
			while ((line = reader.readLine()) != null) {
				processLine(line);
			}

		} catch (Exception e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}
	}

	/**
	 * Process each line from the file.
	 * 
	 * @param line The line to be processed.
	 */
	private static void processLine(String line) {
		// Printing each line to the console
		System.out.println(line);
	}

}
