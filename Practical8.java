package com.corejava.java;

import java.util.Scanner;

/**
 * A Java class (Practical8) demonstrating the calculation of Monthly EMI
 * (Equated Monthly Installment) using a formula for interest and time, and a
 * method 'emiCount' to perform the calculation.
 * 
 * @author prince
 * @version 1.0
 * @since 1/22/2024
 */
public class Practical8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		interest is monthly count for this formula
//		time is a yearly count for this formula
		System.out.println("interest is monthly count for this formula");
		System.out.println("time is a yearly count for this formula");
		System.out.println("Enter amount = ");
		float amount = scan.nextFloat();
		System.out.println("Enter interest = ");
		float interest = scan.nextFloat();
		System.out.println("Enter time = ");
		float time = scan.nextFloat();

		float value = Practical8.emiCount(amount, interest, time);
		System.out.println("Monthly EMI " + value);
		scan.close();
	}

	/**
	 * Method 'emiCount' calculates the Monthly EMI based on the given parameters -
	 * amount, interest, and time.
	 */
	public static float emiCount(float amount, float interest, float time) {
		float value;
		interest = interest / (12 * 100);
		time = time * 12; // one month period
		value = (amount * interest * (float) Math.pow(1 + interest, time)) / (float) (Math.pow(1 + interest, time) - 1);

		return value;
	}

}
