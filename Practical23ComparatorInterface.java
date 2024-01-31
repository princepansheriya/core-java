package comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This program demonstrates sorting a list of books based on title using
 * Comparator.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical23ComparatorInterface {

	public static void main(String[] args) {
		// Creating a list of books
		List<Book> books = new ArrayList<>();
		books.add(new Book("b", 224, 1));
		books.add(new Book("a", 336, 3));
		books.add(new Book("v", 328, 5));
		books.add(new Book("l", 180, 2));

		// Displaying the original list of books
		System.out.println("Original List of Books:");
		for (Book book : books) {
			System.out.println(book);
		}

		// Sorting the list of books based on title using a Comparator
		Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
		Collections.sort(books, titleComparator);

		// Displaying the sorted list of books
		System.out.println("\nSorted List of Books (based on title):");
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
	static class Book {

		private String title;
		private int pageCount;
		private int rating;

		// Constructor
		public Book(String title, int pageCount, int rating) {
			this.title = title;
			this.pageCount = pageCount;
			this.rating = rating;
		}

		// Getter methods
		public String getTitle() {
			return title;
		}

		public int getPageCount() {
			return pageCount;
		}

		public int getRating() {
			return rating;
		}

		// toString method for better representation
		@Override
		public String toString() {
			return "Book{" + "title='" + title + '\'' + ", pageCount=" + pageCount + ", rating=" + rating + '}';
		}

	}

}
