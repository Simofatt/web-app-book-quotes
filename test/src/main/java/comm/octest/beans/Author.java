package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

import comm.octest.dao.BookAuthorDAO;
import comm.octest.dao.BookAuthor.AuthorDAO;

public class Author implements I_Author {

	private String author_name;
	private int id_book;
	private int id_author;
	private int id_type;
	private int id_quote ;
	private BookAuthorDAO<I_Author> authorDAO;

	public Author(String author_name) {
		this.author_name = author_name;
		authorDAO= new AuthorDAO() ; 
	}

	public Author() {
		authorDAO= new AuthorDAO() ; 
	}

	public void save(I_Author author) throws SQLException {
	
		authorDAO.insert(author);
		System.out.println("Author bien saisie ! " + author_name);
	}

	public List<I_Author> fetchAuthors() throws SQLException {
		
		List<I_Author> authorsList = authorDAO.fetch();
		return authorsList;
	}
	
	//UPDATE THE AUTHOR

	public void updateAuthor(I_Author author) throws SQLException 
	{ 
		authorDAO.update(author) ; 
	}
	
	//REMOVE AUTHOR 
	public void removeAuthor(I_Author author) throws SQLException 
	{ 
		authorDAO.remove(author) ; 
	}
	//UPDATE ID AUTHOR IN BOOK TABLE 
	public void updateId(I_Author author) throws SQLException { 
		authorDAO.updateId(author);
	}
	
	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public int getId_author() {
		return id_author;
	}

	public void setId_author(int id_author) {
		this.id_author = id_author;
	}

	public int getId_type() {
		return id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}

	public int getId_quote() {
		return id_quote;
	}

	public void setId_quote(int id_quote) {
		this.id_quote = id_quote;
	}



}
