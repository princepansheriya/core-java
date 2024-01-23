package com.corejava.java;

/**
 * The Practical10 class demonstrates various string manipulation methods in
 * Java. It includes examples of extracting characters, calculating string
 * length, creating substrings, converting cases, checking for prefix and
 * suffix, comparing strings, and concatenating strings.
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical10 {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "hello";
		String str3 = "Hi";

		char ch = str.charAt(1);
		System.out.println("charAt - " + ch);

		int length = str.length();
		System.out.println("length - " + length);

		String substr = str.substring(1);
		System.out.println("substring - " + substr);

		String substr1 = str.substring(1, 3);
		System.out.println("substring using 2 index - " + substr1);

		String lowerCaseStr = str.toLowerCase();
		System.out.println("lowerCaseString - " + lowerCaseStr);

		String upperCaseStr = str.toUpperCase();
		System.out.println("upperCaseString - " + upperCaseStr);

		boolean startsWithHello = str.startsWith("He");
		System.out.println("startsWith - " + startsWithHello);

		boolean endsWithWorld = str.endsWith("Hello");
		System.out.println("endsWith - " + endsWithWorld);

		boolean isEqual1 = str.equals(str2);
		System.out.println("isEqual1 - " + isEqual1);

		boolean isEqualIgnoreCase = str.equalsIgnoreCase(str2);
		System.out.println("isEqualIgnoreCase - " + isEqualIgnoreCase);

		String result = str.concat(str2);
		System.out.println("concat - " + result);

		String combined = str.concat(str2).concat(str3);
		System.out.println("combined - " + combined);

		String originalString = "  Hello,   world!  ";

		// Using .replace() to remove whitespace (only removes spaces, not tabs or
		// newlines)
		String removedWhitespace = originalString.replace(" ", "");
		System.out.println("removedWhitespace - " + removedWhitespace);

		// Using .replaceAll() with a regular expression to remove all whitespace
		String replaceAllString = originalString.replaceAll("\\s", "");
		System.out.println("replaceAllString - " + replaceAllString);

	}

}
