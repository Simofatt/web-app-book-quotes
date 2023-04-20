package comm.octest.beans;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Application {

	private String name_book;
	private String quote_text;
	private String author_name;
	private int id_quote;
	private static Map<String, Author> authors = new HashMap<>();
	private Map<String, Quote> quotes = new HashMap<>();
	private Map<String, Book> books = new HashMap<>();

	public Application(String name_book, String quote_text, String author_name, int id_quote) {
		super();
		this.name_book = name_book;
		this.quote_text = quote_text;
		this.author_name = author_name;
		this.id_quote = id_quote;
	}

	public Application() {
	};

	public void updateQuote(String name_book, String quote_text, String author_name, int id_quote, int user_id,
			String type) throws SQLException {

		QuoteFactory quoteFactory = new QuoteFactory();
		quoteFactory.addQuote(name_book, quote_text, user_id);

		BookFactory bookFactory = new BookFactory();
		bookFactory.addBook(author_name, type, name_book);

		AuthorFactory authorFactory = new AuthorFactory();

		bookFactory.fetchBooks();
		authorFactory.fetchAuthors();

		String quote_key = name_book + quote_text;
		// quoteFactory.fetchQuotes();

		Quote quote = (Quote) quotes.get(quote_key);

		if (quote == null) {
			quote = new Quote(name_book, quote_text, user_id);
			quotes.put(quote_key, quote);
			// quote.update();

		}

		String book_key = author_name + type + name_book;
		Book book = (Book) books.get(book_key);

		if (book == null) {
			book = new Book(name_book, type, author_name);
			books.put(book_key, book);
			// book.update();

		}

	}

	public String getName_book() {
		return name_book;
	}

	public void setName_book(String name_book) {
		this.name_book = name_book;
	}

	public String getQuote_text() {
		return quote_text;
	}

	public void setQuote_text(String quote_text) {
		this.quote_text = quote_text;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getId_quote() {
		return id_quote;
	}

	public void setId_quote(int id_quote) {
		this.id_quote = id_quote;
	}

}
