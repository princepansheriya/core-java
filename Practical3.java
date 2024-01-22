package com.corejava.java;

import java.util.Scanner;

/**
 * A simple Java program that takes a numeric input for a month and prints the
 * corresponding month name. Uses a concise switch expression to handle valid
 * months and display an error message for invalid input.
 *
 * @author prince
 * @version 1.0
 * @since 1/19/2024
 */
public class Practical3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter month in digit = ");
		int month = scan.nextInt();

		String monthName = switch (month) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "Not valid month";
		};

		System.out.println(monthName);
		scan.close();
	}

}
