package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

import comm.octest.db.DAO;

public class Book implements I_book {
	private String id_book;
	private String name_book;
	private String book_img;
	private String author;
	private String type;

	public Book(String name_book, String type, String author) {
		this.name_book = name_book;
		this.type = type;
		this.author = author;
	}

	public Book() {
	}

	public List<Book> fetchBook() throws SQLException {
		DAO dao = new DAO();
		List<Book> books = dao.fetchBooks();
		return books;
	}

	public void save() throws SQLException {
		DAO pseudo = new DAO();
		pseudo.insertBook(name_book, type, author);
		System.out.println("Book bien saisie ! " + name_book);
	}

	public String getId_book() {
		return id_book;
	}

	public void setId_book(String id_book) {
		this.id_book = id_book;
	}

	public String getName_book() {
		return name_book;
	}

	public void setName_book(String name_book) {
		this.name_book = name_book;
	}

	public String getBook_img() {
		return book_img;
	}

	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
