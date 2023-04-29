package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

import comm.octest.dao.BookAuthorDAO;
import comm.octest.dao.BookAuthor.BookDAO;

public class Book implements I_Book {
	private int id_book;
	private String name_book;
	private String book_img;


	private String author;
	private String type;
	private int id_quote;
	private BookAuthorDAO<I_Book>  bookDAO;

	
	public Book(String name_book, String type, String author) {
		this.name_book = name_book;
		this.type = type;
		this.author = author;
		bookDAO = new BookDAO() ;
	}

	public Book() {
		bookDAO = new BookDAO() ;
	}

	
	//GET BOOKS
	public List<I_Book> fetchBooks() throws SQLException {
		
		List<I_Book> books = bookDAO.fetch();
		return books;
	}

	//INSERT BOOK
	public void save(I_Book book) throws SQLException {
	
		bookDAO.insert(book);
		System.out.println("Book bien saisie ! " + name_book);
	}
	
	//UPDATE BOOK 
	public void updateBook(I_Book book2) throws SQLException { 
		bookDAO.update(book2);
	}

	
	//REMOVE BOOK 
	public void removeBook(I_Book book) throws SQLException { 
		bookDAO.remove(book);
	}
	
	//UPDATE ID_BOOK IN THE QUOTE TABLE
	public void updateId(I_Book book) throws SQLException { 
		bookDAO.updateId(book);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// GETTERS AND SETTERS
	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
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
	public int getId_quote() {
		return id_quote;
	}

	public void setId_quote(int id_quote) {
		this.id_quote = id_quote;
	}


	

}
