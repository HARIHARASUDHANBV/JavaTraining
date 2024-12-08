package com.assessment;

import java.util.ArrayList;

class BookCollection {
	private String author_name;
	private String book_title;
	private String isbn;
	private ArrayList<BookCollection> books;

	public BookCollection(String author_name, String book_title, String isbn) {
		this.author_name = author_name;
		this.book_title = book_title;
		this.isbn = isbn;
		this.books = new ArrayList<>();
	}

	public String getAuthor_name() {
		return author_name;
	}

	public String getBook_title() {
		return book_title;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + book_title + '\'' + ", author='" + author_name + '\'' + ", isbn='" + isbn + '\''
				+ '}';
	}

	public void addBook(BookCollection book) {
		books.add(book);
		System.out.println("Book added: " + book);
	}

	public void removeBook(String isbn) {
		boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
		if (removed) {
			System.out.println("Book with ISBN " + isbn + " removed.");
		} else {
			System.out.println("No book found with ISBN " + isbn + ".");
		}
	}

	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the collection.");
		} else {
			System.out.println("Books in the collection:");
			for (BookCollection book : books) {
				System.out.println(book);
			}
		}

	}

}

public class BookInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookCollection collection = new BookCollection(null, null, null);
		collection.addBook(new BookCollection("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
		collection.addBook(new BookCollection("1984", "George Orwell", "0987654321"));
		collection.displayBooks();
		collection.removeBook("0987654321");
		collection.displayBooks();

	}

}
