package com.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This program demonstrates the usage of the Comparable interface in Java. It
 * defines a Book class that implements Comparable, comparing books based on
 * their page count. The program creates a list of books, displays the original
 * list, sorts it based on page count, and then displays the sorted list.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical23ComparableInterface {

	public static void main(String[] args) {
		// Creating a list of books
		List<Book> books = new ArrayList<>();
		books.add(new Book("MANSAINA DIVA", 124));
		books.add(new Book("Saurashtra Ni Rasdhar", 336));
		books.add(new Book("TULSIKYARO", 128));
		books.add(new Book("DADAJINI VAATO", 180));

		// Displaying the original list of books
		System.out.println("Original List of Books:");
		for (Book book : books) {
			System.out.println(book);
		}

		// Sorting the list of books using Collections.sort()
		Collections.sort(books);

		// Displaying the sorted list of books
		System.out.println("\nSorted List of Books (based on page count):");
		for (Book book : books) {
			System.out.println(book);
		}
	}

	/**
	 * Represents a book with title, page count, and rating.
	 * 
	 * @author prince
	 * @version 1.0
	 * @since 1/29/2024
	 */
	static class Book implements Comparable<Book> {

		private String title;
		private int pageCount;

		// Constructor
		public Book(String title, int pageCount) {
			this.title = title;
			this.pageCount = pageCount;
		}

		// Getter methods
		public String getTitle() {
			return title;
		}

		public int getPageCount() {
			return pageCount;
		}

		@Override
		public int compareTo(Book otherBook) {
			// Compare books based on their page count
			return Integer.compare(this.pageCount, otherBook.pageCount);
		}

		// toString method for better representation
		@Override
		public String toString() {
			return "Book{" + "title='" + title + '\'' + ", pageCount=" + pageCount + '}';
		}
		
	}
	
}
