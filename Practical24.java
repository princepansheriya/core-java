package com.oops_concepts.java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * This program demonstrates file handling by writing personal details to a
 * file. It takes input from the user (name, age, and address) and writes it to
 * a file named "myTestFile.txt".
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical24 {

	public static void main(String[] args) {
		// Creating a file object for "myTestFile.txt"
		File file = new File("myTestFile.txt");

		try (FileWriter fileWriter = new FileWriter(file)) {
			Scanner scanner = new Scanner(System.in);

			// Taking user input for name
			System.out.println("Enter your name:");
			String name = scanner.nextLine();

			// Taking user input for age
			System.out.println("Enter your age:");
			int age = scanner.nextInt();
			scanner.nextLine();

			// Taking user input for address
			System.out.println("Enter your address:");
			String address = scanner.nextLine();

			// Writing personal details to the file
			fileWriter.write("Name: " + name + "\n");
			fileWriter.write("Age: " + age + "\n");
			fileWriter.write("Address: " + address + "\n");

			// Closing the scanner
			scanner.close();

			System.out.println("Personal details written to the file successfully.");
		} catch (Exception e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		}
	}

}
