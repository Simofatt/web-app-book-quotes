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
import comm.octest.beans.AuthorFlyweight;
import comm.octest.dao.BookAuthorDAO;

public class AuthorDAOImp implements BookAuthorDAO<AuthorFlyweight> {
	Connection connexion = null;
	Statement statement = null;
	ResultSet resultat = null;

	public AuthorDAOImp() {}

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
		public List<AuthorFlyweight> fetch() throws SQLException {
			List<AuthorFlyweight> authors = new ArrayList<>();
			
			driver();
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
		public void insert(AuthorFlyweight author) throws SQLException {
			
			String author_name = author.getAuthor_name();
			driver();
			PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO authors(name) VALUES (?)");
			preparedStatement.setString(1, author_name);
			preparedStatement.executeUpdate();

		}
		
		//UPDATE AUTHOR(FLYWEIGHT)
		
		public void update(AuthorFlyweight author) throws SQLException { 
				String author_name = author.getAuthor_name();
				int id_author = author.getId_author() ;
				
				driver();
				PreparedStatement preparedStatement2 = connexion.prepareStatement("UPDATE authors SET name =?  WHERE id_author=? ");
				preparedStatement2.setString(1, author_name);
				preparedStatement2.setInt(2, id_author);
				preparedStatement2.executeUpdate();			
			}
				
	
		//REMOVE A AUTHOR WHEN UPDATE (FLYWEIGHT)
		public void remove(AuthorFlyweight author) throws SQLException {
			int id_author = author.getId_author();
			
			 driver();
			 PreparedStatement preparedStatement5 = connexion.prepareStatement("DELETE FROM authors WHERE id_author=? ");
			 preparedStatement5.setInt(1, id_author);
			 preparedStatement5.executeUpdate();
		}
		
		// TO UPDATE THE ID AUTHOR IN BOOKS TABLE 
		public void updateId(AuthorFlyweight author) throws SQLException {
			 int id_author = author.getId_author(); 
			 int id_book = author.getId_book() ;
			 driver();
			 
			PreparedStatement preparedStatement4 = connexion.prepareStatement("UPDATE books SET id_author = ?  WHERE id_book=?");
			preparedStatement4.setInt(1, id_author);
			preparedStatement4.setInt(2, id_book);
			preparedStatement4.executeUpdate();
	
		}

}
