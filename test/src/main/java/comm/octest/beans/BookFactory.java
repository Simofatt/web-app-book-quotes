package comm.octest.beans;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookFactory {

	private Map<String, Book> books = new HashMap<>();

	public Book addBook(String author_name, String type, String book_name) throws SQLException {
		// CREATE THE KEY
		String key = author_name + type + book_name;

		fetchBooks();
		Book book = (Book) books.get(key);
		// IF IT DOESN'T EXIST, CREATE A NEW ONE IN THE MAP
		if (book == null) {
			book = new Book(book_name, type, author_name);
			books.put(key, book);
			book.save();

		}
		return book;
	}

	public void fetchBooks() throws SQLException {
		Book book = new Book();
		List<Book> booksList = book.fetchBook();

		for (Book b : booksList) {
			String book_name = b.getName_book();
			String type_name = b.getType();
			String author_name = b.getAuthor();

			String key = author_name + type_name + book_name;

			books.put(key, book);
		}

	}

}
