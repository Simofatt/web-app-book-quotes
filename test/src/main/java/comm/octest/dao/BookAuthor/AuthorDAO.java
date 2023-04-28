package comm.octest.dao.BookAuthor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.octest.beans.Author;
import comm.octest.beans.I_Author;
import comm.octest.dao.BookAuthorDAO;

public class AuthorDAO implements BookAuthorDAO<I_Author> {
	Connection connexion = null;
	Statement statement = null;
	ResultSet resultat = null;

	public AuthorDAO() {}

	public void driver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/goodQuotes", "root", "");
			System.out.println("Connexion reussite ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//FETCH ALL THE AUTHORS : 
		public List<I_Author> fetch() throws SQLException {

			driver();
			List<I_Author> authors = new ArrayList<>();

			PreparedStatement preparedStatement = connexion.prepareStatement("SELECT name FROM authors");
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				String author_name = resultat.getString("name");
				Author author = new Author(author_name);
				authors.add(author);
			}

			return authors;
		}

	//INSERT THE AUTHOR (FLYWEIGHT) 
		public void insert(I_Author author) throws SQLException {
			
			String author_name = author.getAuthor_name();
			driver();
			PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO authors(name) VALUES (?)");
			preparedStatement.setString(1, author_name);
			preparedStatement.executeUpdate();

		}
		
		//UPDATE AUTHOR(FLYWEIGHT)
		
		public void update(I_Author author) throws SQLException { 
			String author_name = author.getAuthor_name();
			int id_author = author.getId_author() ;
			
			driver();
		
				PreparedStatement preparedStatement2 = connexion.prepareStatement("UPDATE authors SET name =?  WHERE id_author=? ");

				preparedStatement2.setString(1, author_name);
				preparedStatement2.setInt(2, id_author);
				preparedStatement2.executeUpdate();		
				
			}
				
		

		public void remove(I_Author author) throws SQLException {
			int id_author = author.getId_author();
			driver();
			System.out.println("DELETE AUTHOR") ;
			PreparedStatement preparedStatement5 = connexion
					.prepareStatement("DELETE FROM authors WHERE id_author=? ");
			
			preparedStatement5.setInt(1, id_author);
			 preparedStatement5.executeUpdate();
		}
		
		public void updateId(I_Author author) throws SQLException {

			 int id_author = author.getId_author(); 
			 int id_book = author.getId_book() ;
			 driver();
			PreparedStatement preparedStatement4 = connexion.prepareStatement("UPDATE books SET id_author = ?  WHERE id_book=?");

			preparedStatement4.setInt(1, id_author);
			preparedStatement4.setInt(2, id_book);
			preparedStatement4.executeUpdate();
	
		}
		
		

}
