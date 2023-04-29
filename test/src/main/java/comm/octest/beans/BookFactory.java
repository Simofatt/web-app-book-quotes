package comm.octest.beans;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookFactory {

	private static  Map<String, I_Book> books = new HashMap<>();

	public I_Book addBook(String author_name, String type, String book_name) throws SQLException {
		// CREATE THE KEY
		String key = author_name + type + book_name;
		fetchBooks();
		I_Book book = (Book) books.get(key);
		// IF IT DOESN'T EXIST, CREATE A NEW ONE IN THE MAP
		if (book == null) {
			book = new Book(book_name, type, author_name);
			putBook(key, book);
			book.save(book);
		} 
		return book;
	}
	
	public void updateBook(Flyweight quote) throws SQLException {
		
		String author_name = quote.getAuthor_name() ; 
		String book_name = quote.getName_book();
		int id_quote = quote.getId_quote();
		String type = quote.getType() ;
		int id_book = quote.getBook_id() ;
		String key = author_name + type + book_name;
		System.out.println("*********** KEY    :  "+key);
		fetchBooks();
		
		if (!books.containsKey(key)) {
				I_Book book = new Book(book_name, type, author_name);
				books.put(key, book);
				I_Book book2= new Book() ; 
				book2.setName_book(book_name);
				book2.setId_book(id_book);
				
			    book2.updateBook(book2);   
		    
	   } else { 
	
				I_Book book2= new Book() ; 
				book2.setId_quote(id_quote);
				book2.setId_book(id_book);
				
				book2.updateId(book2) ;
				book2.removeBook(book2) ;
				removeBook(key) ;		
	}	
	}

	public void fetchBooks() throws SQLException {
		I_Book book = new Book();
		List<I_Book> booksList = book.fetchBooks();
		for (I_Book b : booksList) {
			
			String book_name = b.getName_book();
			String type_name = b.getType();
			String author_name = b.getAuthor();
			String key = author_name + type_name + book_name;
			if (!books.containsKey(key)) {
			putBook(key, book);
			}
			System.out.println("********** "+b.getAuthor()+b.getType()+b.getName_book());
		}
		}

	
	// ADD A BOOK TO THE MAP
	public void putBook(String key, I_Book book) {
		if (!books.containsKey(key)) {
		books.put(key, book);
	}
	}

	// REMOVE A BOOK FROM THE MAP
	public void removeBook(String key) {
		books.remove(key);
	}
	
	
	}


