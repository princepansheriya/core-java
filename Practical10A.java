package com.corejava.java;

import java.math.BigDecimal;

/**
 * The Practical10A class demonstrates comparison operations for different data
 * types - Strings, Integers, and BigDecimals. It highlights the distinction
 * between reference equality and content equality using == and equals()
 * methods.
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical10A {

	public static void main(String[] args) {
		// String comparison
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println("String Comparison:");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		// Integer comparison
		Integer num1 = Integer.valueOf(20);
		Integer num2 = Integer.valueOf(20);

		System.out.println("\nInteger Comparison:");
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));

		// BigDecimal comparison
		BigDecimal bd1 = new BigDecimal("5.0");
		BigDecimal bd2 = new BigDecimal("5.0");

		System.out.println("\nBigDecimal Comparison:");
		System.out.println(bd1 == bd2);
		System.out.println(bd1.equals(bd2));
	}

}
