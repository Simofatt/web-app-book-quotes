package comm.octest.beans;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorFactory {
	private static  Map<String, AuthorFlyweight> authors = new HashMap<>();

	public AuthorFlyweight addAuthor(String author_name) throws SQLException {
		// CREATE THE KEY
		String key = author_name;
		fetchAuthors();
		AuthorFlyweight author = (AuthorFlyweight) authors.get(key);
		// IF IT DOESN'T EXIST, CREATE A NEW ONE IN THE MAP
		if (author == null) {
			author = new Author(author_name);
			putAuthor(key, author);
			author.save(author);
		}

		return author;
	}
	public void updateAuthor(Flyweight quote) throws SQLException {
		// CREATE THE KEY
		String author_name = quote.getAuthor_name() ; 
	    int id_author = quote.getAuthor_id() ; 
	    int id_book =quote.getBook_id();
		String key = author_name;
		fetchAuthors();
		AuthorFlyweight author = (AuthorFlyweight) authors.get(key);

		// IF IT DOESN'T EXIST, CREATE A NEW ONE IN THE MAP
		if (author == null) {
			author = new Author(author_name);
			putAuthor(key, author);
			AuthorFlyweight author2 = new Author() ; 
			author2.setAuthor_name(author_name);
			author2.setId_author(id_author);
			
			author2.updateAuthor(author2);
			
		}else { 
			
			AuthorFlyweight author2 = new Author() ; 
			author2.setId_author(id_author);
			author2.setId_book(id_book);
			
			author.updateId(author2) ;
			author.removeAuthor(author2) ;	
		}	
	}
	

	public void fetchAuthors() throws SQLException {
		AuthorFlyweight author = new Author();
		List<AuthorFlyweight> authorsList = author.fetchAuthors();
		for (AuthorFlyweight a : authorsList) {
			String key = a.getAuthor_name();
			if (!authors.containsKey(key)) {
				authors.put(key, a);
				}
			System.out.println("AUTHOR KEY => "+key +"  NAME => "+a.getAuthor_name()) ;

		}
	}

	// ADD A AUTHOR FROM THE MAP
		public void putAuthor(String key, AuthorFlyweight author) {
			if (!authors.containsKey(key)) {
			authors.put(key, author);
		}
		}

		// REMOVE A AUTHOR FROM THE MAP
		public void removeAuthor(String key) {
			authors.remove(key);
		}
		
}
