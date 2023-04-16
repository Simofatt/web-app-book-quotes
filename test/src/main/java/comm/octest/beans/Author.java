package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

import comm.octest.db.DAO;

public class Author implements I_author {

	private String author_name;
	private int id_book;
	private int id_author;
	private int id_type;

	public Author(String author_name) {
		this.author_name = author_name;
	}

	public Author() {
	}

	public void save() throws SQLException {
		DAO pseudo = new DAO();
		pseudo.insertAuthor(author_name);
		System.out.println("Author bien saisie ! " + author_name);
	}

	public List<Author> fetchAuthor() throws SQLException {
		DAO dao = new DAO();
		List<Author> authorsList = dao.fetchAuthors();
		return authorsList;
	}

	public void followAuthor(int user_id, int id_author) {
		// SQL REQUEST OT ADD IN THE FOLLOW AUTHOR TABLE
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

}
