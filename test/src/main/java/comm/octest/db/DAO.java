package comm.octest.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import comm.octest.beans.Author;
import comm.octest.beans.Book;
import comm.octest.beans.Flyweight;
import comm.octest.beans.Observer;
import comm.octest.beans.QuoteManager;
import comm.octest.beans.User;

public class DAO {

	Connection connexion = null;
	Statement statement = null;
	ResultSet resultat = null;

	public DAO() {
	}

	public void driver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/goodQuotes", "root", "");
			System.out.println("Connexion reussite ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// REGISTRATION
	public void registration(Observer user) {

		String email = user.getEmail();
		String name = user.getName();
		String password = user.getPassword();
		String city = user.getCity();
		System.out.println(user.getEmail());

		try {
			driver();
			PreparedStatement preparedStatement = connexion
					.prepareStatement("INSERT INTO users(full_name,email,city, password) VALUES (?,?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, city);
			preparedStatement.setString(4, password);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//AUTHENTIFICATION 
	public boolean authentification(Observer user) {
		String email = user.getEmail();
		String password = user.getPassword();
		System.out.println("authentification :" + email);
		boolean auth = false;
		try {
			driver();
			PreparedStatement preparedStatement = connexion
					.prepareStatement("SELECT password FROM users WHERE email = ?");
			preparedStatement.setString(1, email);
			ResultSet resultat = preparedStatement.executeQuery();

			if (resultat.next()) {
				String passwordBb = resultat.getString("password");
				if (password.equals(passwordBb)) {
					auth = true;
				}
			} else {
				auth = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return auth;
	}

	// GET THE ID OF THE USER
	public int getId(String email) throws SQLException {

		driver();
		PreparedStatement preparedStatement = connexion.prepareStatement("SELECT id_user FROM users WHERE email = ?");
		preparedStatement.setString(1, email);
		ResultSet resultat = preparedStatement.executeQuery();
		if (resultat.next()) {
			int id_user = resultat.getInt("id_user");
			return id_user;
		}

		return -1;

	}

	// CHECK UNICITE OF THE EMAIL
	public boolean validerInput(String name, String email, String password, String passwordc)
			throws SQLException, ClassNotFoundException {

		driver();
		PreparedStatement preparedStatement = connexion.prepareStatement("SELECT * FROM users WHERE email = ?");
		preparedStatement.setString(1, email);
		ResultSet resultat = preparedStatement.executeQuery();

		if (resultat.next()) {
			System.out.println("email exists");
			return false;
		} else {

			if (password.equals(passwordc)) {
				System.out.println("Password checked");
				return true;
			} else {
				System.out.println("The password dont match ");
				return false;
			}
		}

	}

//FETCH ALL THE AUTHORS : 
	public List<Author> fetchAuthors() throws SQLException {

		driver();
		List<Author> authors = new ArrayList<>();

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
	public void insertAuthor(String author_name) throws SQLException {

		driver();
		PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO authors(name) VALUES (?)");
		preparedStatement.setString(1, author_name);
		preparedStatement.executeUpdate();

	}

//FETCH BOOKS
	public List<Book> fetchBooks() throws SQLException {
		List<Book> books = new ArrayList<>();

		driver();
		PreparedStatement preparedStatement = connexion.prepareStatement(
				"SELECT b.*,t.name AS type_name, a.name AS author_name FROM books b INNER JOIN types t ON b.id_type = t.id_type INNER JOIN authors a ON b.id_author = a.id_author");
		ResultSet resultat = preparedStatement.executeQuery();

		while (resultat.next()) {

			String book_name = resultat.getString("name");
			String type_name = resultat.getString("type_name");
			String author_name = resultat.getString("author_name");
			Book book = new Book(book_name, type_name, author_name);
			System.out.println(book_name);

			books.add(book);

		}
		return books;
	}

//INSERT BOOK (FLYWEIGHT) 

	public void insertBook(String book_name, String type_name, String author_name) throws SQLException {

		driver();
		System.out.println("book bien saisie ! " + book_name);
		PreparedStatement preparedStatement2 = connexion.prepareStatement("SELECT id_type FROM types WHERE name =?");
		preparedStatement2.setString(1, type_name);
		ResultSet resultat2 = preparedStatement2.executeQuery();

		if (resultat2.next()) {

			int id_type = resultat2.getInt("id_type");

			PreparedStatement preparedStatement3 = connexion
					.prepareStatement("SELECT id_author FROM authors WHERE name =?");
			preparedStatement3.setString(1, author_name);
			ResultSet resultat3 = preparedStatement3.executeQuery();

			if (resultat3.next()) {
				int id_author = resultat3.getInt("id_author");

				PreparedStatement preparedStatement = connexion
						.prepareStatement("INSERT INTO books(name,id_type,id_author) VALUES (?,?,?)");
				preparedStatement.setString(1, book_name);
				preparedStatement.setInt(2, id_type);
				preparedStatement.setInt(3, id_author);
				preparedStatement.executeUpdate();
			}
		}
	}

//FETCH ALL THE QUOTES && CHECK IF THE USER LIKED THE QUOTE OR NOT 
	public List<QuoteManager> fetchQuotes(int user_id) throws SQLException {
		List<QuoteManager> quotes = new ArrayList<>();
		String color;
		driver();

		PreparedStatement preparedStatement = connexion.prepareStatement(
				"SELECT q.*, b.name AS book_name,a.name AS author_name, uq.id_user,u.full_name AS user_name, u.email as email FROM quotes q INNER JOIN books b ON q.id_book = b.id_book INNER JOIN authors a ON b.id_author = a.id_author INNER JOIN user_quote uq ON q.id_quote = uq.id_quote INNER JOIN users u ON uq.id_user= u.id_user  WHERE u.id_user !=? ");
		preparedStatement.setInt(1, user_id);
		ResultSet resultat = preparedStatement.executeQuery();

		while (resultat.next()) {
			String quote_text = resultat.getString("quote_text");
			String book_name = resultat.getString("book_name");
			Timestamp created_at = resultat.getTimestamp("created_at");
			String user_name = resultat.getString("user_name");
			String author_name = resultat.getString("author_name");
			int id_quote = resultat.getInt("id_quote");
			String emailOfTheProfile = resultat.getString("email") ;
			System.out.println("email of the owner of the quote is " +emailOfTheProfile) ;
			System.out.println("email of the owner of the quote is ") ;

			PreparedStatement preparedStatement2 = connexion
					.prepareStatement("SELECT * from like_quote WHERE id_user =? AND id_quote=?");
			preparedStatement2.setInt(1, user_id);
			preparedStatement2.setInt(2, id_quote);
			ResultSet resultat2 = preparedStatement2.executeQuery();
			if (resultat2.next()) {
				color = "red";

			} else {
				color = "blue";
			}

			QuoteManager quote = new QuoteManager(book_name, quote_text, author_name, created_at, user_name, id_quote,
					color,emailOfTheProfile);
			quotes.add(quote);
		}
		return quotes;

	}
	public List<QuoteManager> fetchUserQuotes(int user_id,int id_user_session) throws SQLException {
		List<QuoteManager> quotes = new ArrayList<>();
		String color;
		driver();

		PreparedStatement preparedStatement = connexion.prepareStatement(
				"SELECT q.*, b.name AS book_name,a.name AS author_name, uq.id_user,u.full_name AS user_name, u.email as email FROM quotes q INNER JOIN books b ON q.id_book = b.id_book INNER JOIN authors a ON b.id_author = a.id_author INNER JOIN user_quote uq ON q.id_quote = uq.id_quote INNER JOIN users u ON uq.id_user= u.id_user  WHERE u.id_user =? ");
		preparedStatement.setInt(1, user_id);
		ResultSet resultat = preparedStatement.executeQuery();

		while (resultat.next()) {
			String quote_text = resultat.getString("quote_text");
			String book_name = resultat.getString("book_name");
			Timestamp created_at = resultat.getTimestamp("created_at");
			String user_name = resultat.getString("user_name");
			String author_name = resultat.getString("author_name");
			int id_quote = resultat.getInt("id_quote");
			String emailOfTheProfile = resultat.getString("email") ;
		

			PreparedStatement preparedStatement2 = connexion
					.prepareStatement("SELECT * from like_quote WHERE id_user =? AND id_quote=?");
			preparedStatement2.setInt(1, id_user_session);
			preparedStatement2.setInt(2, id_quote);
			ResultSet resultat2 = preparedStatement2.executeQuery();
			if (resultat2.next()) {
				color = "red";

			} else {
				color = "blue";
			}

			QuoteManager quote = new QuoteManager(book_name, quote_text, author_name, created_at, user_name, id_quote,
					color,emailOfTheProfile);
			quotes.add(quote);
		}
		return quotes;

	}

	public List<QuoteManager> fetchMyQuotes(String email) throws SQLException {
		List<QuoteManager> quotes = new ArrayList<>();
		driver();

		System.out.println("Affichage des quote de user : " + email);
		PreparedStatement preparedStatement = connexion.prepareStatement(
				"SELECT q.*, b.name AS book_name,a.name AS author_name, uq.id_user,u.full_name AS user_name FROM quotes q INNER JOIN books b ON q.id_book = b.id_book INNER JOIN authors a ON b.id_author = a.id_author INNER JOIN user_quote uq ON q.id_quote = uq.id_quote INNER JOIN users u ON uq.id_user= u.id_user WHERE u.email =? ");
		preparedStatement.setString(1, email);
		ResultSet resultat = preparedStatement.executeQuery();

		while (resultat.next()) {
			String quote_text = resultat.getString("quote_text");
			String book_name = resultat.getString("book_name");
			Timestamp created_at = resultat.getTimestamp("created_at");
			String user_name = resultat.getString("user_name");
			String author_name = resultat.getString("author_name");
			int id_quote = resultat.getInt("id_quote");
	

			QuoteManager quote = new QuoteManager(book_name, quote_text, author_name, created_at, user_name, id_quote,email);
			quotes.add(quote);
		}
		return quotes;
	}

//INSERT QUOTE 
	public int insertQuote(String book_name, String quote_text) throws SQLException {
		driver();

		PreparedStatement preparedStatement3 = connexion.prepareStatement("SELECT id_book FROM books WHERE name =?");
		preparedStatement3.setString(1, book_name);
		ResultSet resultat3 = preparedStatement3.executeQuery();

		if (resultat3.next()) {
			int id_book = resultat3.getInt("id_book");
			PreparedStatement preparedStatement = connexion.prepareStatement(
					"INSERT INTO quotes(id_book,quote_text) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, id_book);
			preparedStatement.setString(2, quote_text);

			preparedStatement.executeUpdate();

			System.out.println("Quote bien inserer :" + quote_text);
			ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
			if (generatedKeys.next()) {
				int id_quote = generatedKeys.getInt(1);
				System.out.println("The ID of the inserted quote is: " + id_quote);
				return id_quote;
			}

		}
		return -1;

	}

	// UPDATE THE QUOTE
	public void updateQuote(Flyweight quote) throws SQLException {

		String author_name = quote.getAuthor_name();
		String book_name = quote.getName_book();
		String quote_text = quote.getQuoteText();
		int id_quote = quote.getId_quote();
	
		driver();
		PreparedStatement preparedStatement5 = connexion
				.prepareStatement("SELECT id_book FROM quotes WHERE id_quote =? ");
		preparedStatement5.setInt(1, id_quote);
		ResultSet resultat5 = preparedStatement5.executeQuery();
		if (resultat5.next()) {
			int id_book = resultat5.getInt("id_book");

			PreparedStatement preparedStatement = connexion
					.prepareStatement("SELECT id_author FROM authors WHERE name =? ");
			preparedStatement.setString(1, author_name);
			ResultSet resultat = preparedStatement.executeQuery();
			if (resultat.next()) {
				int id_author = resultat.getInt("id_author");

				PreparedStatement preparedStatement2 = connexion
						.prepareStatement("UPDATE books SET name =? , id_author=? WHERE id_book=? ");

				preparedStatement2.setString(1, book_name);
				preparedStatement2.setInt(2, id_author);
				preparedStatement2.setInt(3, id_book);
				preparedStatement2.executeUpdate();

				PreparedStatement preparedStatement4 = connexion
						.prepareStatement("UPDATE quotes SET quote_text = ? , id_book = ? WHERE id_quote =?");

				preparedStatement4.setString(1, quote_text);
				preparedStatement4.setInt(2, id_book);
				preparedStatement4.setInt(3, id_quote);
				preparedStatement4.executeUpdate();

			}

		}

	}

//FETCH ALL THE USER_QUOTE 
	public List<QuoteManager> fetchUserQuote() throws SQLException {
		driver();
		List<QuoteManager> user_quote = new ArrayList<>();

		PreparedStatement preparedStatement = connexion.prepareStatement(
				"SELECT uq.*,quote_text FROM user_quote uq INNER JOIN quotes q ON uq.id_quote = q.id_quote ");
		ResultSet resultat = preparedStatement.executeQuery();

		while (resultat.next()) {
			String quote_text = resultat.getString("quote_text");
			int id_user = resultat.getInt("id_user");

			QuoteManager quote = new QuoteManager(quote_text, id_user);
			user_quote.add(quote);

		}
		return user_quote;

	}

//INSERT USER QUOTE 
	public int insertUserQuote(String quote_text, int user_id) throws SQLException {
		driver();
		System.out.println("user_id : " + user_id + " SQUOTE ID ");

		PreparedStatement preparedStatement3 = connexion
				.prepareStatement("SELECT id_quote FROM quotes WHERE quote_text =?");
		preparedStatement3.setString(1, quote_text);
		ResultSet resultat3 = preparedStatement3.executeQuery();

		if (resultat3.next()) {
			int id_quote = resultat3.getInt("id_quote");

			PreparedStatement preparedStatement = connexion
					.prepareStatement("INSERT INTO user_quote(id_user,id_quote) VALUES (?,?)");
			preparedStatement.setInt(1, user_id);
			preparedStatement.setInt(2, id_quote);
			System.out.println("user_id : " + user_id + " SQUOTE ID " + id_quote);
			preparedStatement.executeUpdate();
			return id_quote;
		}
		return -1;
	}

	// GET INFORMATION OF A USER
	public List<User> getUser(String email, int idUserConnected) throws SQLException {
		List<User> userInfo = new ArrayList<>();
		boolean isFriends;
		int nbreFriends;

		driver();
		PreparedStatement preparedStatement3 = connexion.prepareStatement(
				"SELECT u.*, COUNT(CASE WHEN uq.id_user IS NOT NULL THEN 1 ELSE 0 END) AS nbreQuotes, COUNT(CASE WHEN lk.id_quote IS NOT NULL THEN 1 ELSE 0 END)  as nbreOfLikes FROM users u LEFT JOIN user_quote uq ON u.id_user = uq.id_user LEFT JOIN like_quote lk ON uq.id_quote = lk.id_quote  WHERE email =? GROUP BY u.id_user   ");
		preparedStatement3.setString(1, email);

		ResultSet resultat3 = preparedStatement3.executeQuery();

		if (resultat3.next()) {
			String full_name = resultat3.getString("full_name");
			String country = resultat3.getString("country");
			String city = resultat3.getString("city");
			String emailProfile = resultat3.getString("email");
			String password = resultat3.getString("password");
			Timestamp created_at = resultat3.getTimestamp("created_at");
			int nbreQuotes = resultat3.getInt("nbreQuotes");
			int id_user = resultat3.getInt("id_user");
			int nbre_likes = resultat3.getInt("nbreOfLikes");

			PreparedStatement preparedStatement4 = connexion.prepareStatement(
					"SELECT COUNT(*) as nbreOfFriends FROM friendships WHERE id_user1 =? or id_user2=? ");

			preparedStatement4.setInt(1, id_user);
			preparedStatement4.setInt(2, id_user);

			ResultSet resultat4 = preparedStatement4.executeQuery();

			PreparedStatement preparedStatement5 = connexion.prepareStatement(
					"SELECT * FROM friendships WHERE id_user1 =?  AND id_user2 =? or id_user2=? AND id_user1=?");
			preparedStatement5.setInt(1, idUserConnected);
			preparedStatement5.setInt(2, id_user);
			preparedStatement5.setInt(3, idUserConnected);
			preparedStatement5.setInt(4, id_user);

			ResultSet resultat5 = preparedStatement5.executeQuery();

			if (resultat4.next()) {
				nbreFriends = resultat4.getInt("nbreOfFriends");

			} else {

				nbreFriends = 0;

			}

			if (resultat5.next()) {
				isFriends = true;

			} else {
				isFriends = false;

			}
			User user = new User(full_name, country, city, password, created_at, emailProfile, nbreQuotes, id_user,
					nbreFriends, nbre_likes, isFriends);
			userInfo.add(user);
		}
		return userInfo;

	}

	// check if the email exists :
	public boolean validEmail(String email, String currentEmail) throws SQLException {
		driver();
		PreparedStatement preparedStatement = connexion
				.prepareStatement("SELECT COUNT(*) AS count FROM users WHERE email = ? AND email != ?");
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, currentEmail);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int count = resultSet.getInt("count");
			if (count > 0) {
				return false; // email already exists for another user
			} else {
				return true; // email does not exist for any other user
			}
		}
		return false; // something went wrong
	}

	// UPDATE USER INFO
	public void updateUserInfo(Observer user) throws SQLException {
		String full_name = user.getName();
		String email = user.getEmail();
		String country = user.getCountry();
		String city = user.getCity();
		String password = user.getPassword();
		int id_user = user.getId_user();

		driver();
		PreparedStatement preparedStatement = connexion
				.prepareStatement("UPDATE users SET full_name = ?,email=?,country=?,city=?,password=? WHERE id_user=?");
		preparedStatement.setString(1, full_name);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, country);
		preparedStatement.setString(4, city);
		preparedStatement.setString(5, password);
		preparedStatement.setInt(6, id_user);
		preparedStatement.executeUpdate();

	}

	// ADD LIKED QUOTE
	public void addLikedQuote(Observer user) throws SQLException {
		int user_id = user.getId_user();
		int quote_id = user.getId_quote();
		driver();
		PreparedStatement preparedStatement2 = connexion
				.prepareStatement("SELECT * FROM like_quote WHERE id_user=? AND id_quote=?");
		preparedStatement2.setInt(1, user_id);
		preparedStatement2.setInt(2, quote_id);
		ResultSet resultat2 = preparedStatement2.executeQuery();
		if (resultat2.next()) {

			PreparedStatement preparedStatement3 = connexion
					.prepareStatement("DELETE FROM like_quote WHERE id_user=? AND id_quote=?");
			preparedStatement3.setInt(1, user_id);
			preparedStatement3.setInt(2, quote_id);
			preparedStatement3.executeUpdate();

		} else {

			PreparedStatement preparedStatement = connexion
					.prepareStatement("INSERT INTO like_quote(id_user,id_quote) VALUES (?,?)");
			preparedStatement.setInt(1, user_id);
			preparedStatement.setInt(2, quote_id);
			preparedStatement.executeUpdate();
		}

	}

	// FETCH USER FAVORITE QUOTES

	public List<QuoteManager> fetchFavQuotes(int user_id) throws SQLException {

		List<QuoteManager> favQuotes = new ArrayList<>();
		driver();
		PreparedStatement preparedStatement2 = connexion
				.prepareStatement("SELECT id_quote FROM like_quote WHERE id_user=?");
		preparedStatement2.setInt(1, user_id);

		ResultSet resultat2 = preparedStatement2.executeQuery();
		while (resultat2.next()) {
			int quote_id = resultat2.getInt("id_quote");
			System.out.print("next1: " + quote_id);
			PreparedStatement preparedStatement = connexion.prepareStatement(
					"SELECT q.*, b.name AS book_name,a.name AS author_name,u.full_name AS user_name ,u.email as email FROM quotes q INNER JOIN books b ON q.id_book = b.id_book INNER JOIN authors a ON b.id_author = a.id_author INNER JOIN user_quote uq ON q.id_quote = uq.id_quote INNER JOIN users u ON uq.id_user= u.id_user WHERE q.id_quote=? ");
			preparedStatement.setInt(1, quote_id);
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				System.out.println("next 2 ");
				String quote_text = resultat.getString("quote_text");
				String book_name = resultat.getString("book_name");
				Timestamp created_at = resultat.getTimestamp("created_at");
				String user_name = resultat.getString("user_name");
				String author_name = resultat.getString("author_name");
				String email = resultat.getString("email") ;
				String color = "red";

				QuoteManager quote = new QuoteManager(book_name, quote_text, author_name, created_at, user_name,
						quote_id, color,email);
				favQuotes.add(quote);

			}

		}

		return favQuotes;

	}

	// REMOVE LIKED QUOTES
	public void removeLikedQuote(Flyweight quote) throws SQLException {
		int user_id = quote.getUserId();
		int quote_id = quote.getId_quote();
		driver();
		PreparedStatement preparedStatement3 = connexion
				.prepareStatement("DELETE FROM like_quote WHERE id_user=? AND id_quote=?");
		preparedStatement3.setInt(1, user_id);
		preparedStatement3.setInt(2, quote_id);
		preparedStatement3.executeUpdate();

	}

	// INSERT NOTIFICATION FOR A NEW QUOTE
	public void insertNotification(int id_quote, int id_user) throws SQLException {
		driver();

		PreparedStatement preparedStatement2 = connexion
				.prepareStatement("SELECT id_user FROM user_quote WHERE id_quote=?");
		preparedStatement2.setInt(1, id_quote);

		ResultSet resultat2 = preparedStatement2.executeQuery();
		while (resultat2.next()) {
			int idOwnerOfTheQuote = resultat2.getInt("id_user");

			if (idOwnerOfTheQuote != id_user) {

				PreparedStatement preparedStatement5 = connexion
						.prepareStatement("INSERT INTO notification_quotes(id_quote,id_user) VALUES (?,?) ");
				preparedStatement5.setInt(1, id_quote);
				preparedStatement5.setInt(2, id_user);
				System.out.println(id_quote);
				System.out.println(id_user);
				preparedStatement5.executeUpdate();
			}
		}
	}

	// TO GET NOTIFICATIONS:
	public List<Flyweight> getNotification(int id_user) throws SQLException {
		List<Flyweight> notifications = new ArrayList<>();
		driver();

		PreparedStatement preparedStatement2 = connexion
				.prepareStatement("SELECT nq.id_quote FROM notification_quotes nq WHERE nq.id_user=?");
		preparedStatement2.setInt(1, id_user);
		ResultSet resultat2 = preparedStatement2.executeQuery();
		while (resultat2.next()) {

			int id_quote = resultat2.getInt("id_quote");
			Flyweight quoteNotification = new QuoteManager();
			quoteNotification.setId_quote(id_quote);
			System.out.print(id_quote);
			notifications.add(quoteNotification);

		}
		return notifications;

	}

	// DELETE THE NOTIFS
	public void removeNotification(int id_quote, int id_user) throws SQLException {
		driver();
		PreparedStatement preparedStatement5 = connexion
				.prepareStatement("DELETE FROM notification_quotes WHERE id_quote =? AND id_user=?");
		preparedStatement5.setInt(1, id_quote);
		preparedStatement5.setInt(2, id_user);
		preparedStatement5.executeUpdate();

	}

	// FETCH USERS TO DISPLAY THEM :
	public List<Observer> getUsers(int idUserConnected) throws SQLException {
		List<Observer> users = new ArrayList<>();
		driver();
		PreparedStatement preparedStatement2 = connexion.prepareStatement(
				"SELECT u.*, COUNT(CASE WHEN uq.id_user IS NOT NULL THEN 1 ELSE 0 END) AS nbreQuotes FROM users u LEFT JOIN user_quote uq ON u.id_user = uq.id_user GROUP BY u.id_user ");

		ResultSet resultat2 = preparedStatement2.executeQuery();
		while (resultat2.next()) {
			String full_name = resultat2.getString("full_name");
			String email = resultat2.getString("email");
			String country = resultat2.getString("country");
			String city = resultat2.getString("city");
			int nbreQuotes = resultat2.getInt("nbreQuotes");
			int id_user = resultat2.getInt("id_user");

			PreparedStatement preparedStatement3 = connexion.prepareStatement(
					"SELECT * FROM friendships WHERE id_user1 =?  AND id_user2 =? or id_user2=? AND id_user1=?");
			preparedStatement3.setInt(1, idUserConnected);
			preparedStatement3.setInt(2, id_user);
			preparedStatement3.setInt(3, idUserConnected);
			preparedStatement3.setInt(4, id_user);

			ResultSet resultat3 = preparedStatement3.executeQuery();
			Observer user = new User();

			user.setCity(city);
			user.setCountry(country);
			user.setEmail(email);
			user.setName(full_name);
			user.setId_user(id_user);
			user.setNbreQuoteAdded(nbreQuotes);
			if (resultat3.next()) {

				boolean isFriends = true;
				user.setFriends(isFriends);

			} else {
				boolean isFriends = false;
				user.setFriends(isFriends);
			}
			PreparedStatement preparedStatement4 = connexion.prepareStatement(
					"SELECT COUNT(*) as nbreOfFriends FROM friendships WHERE id_user1 =? or id_user2=? ");

			preparedStatement4.setInt(1, id_user);
			preparedStatement4.setInt(2, idUserConnected);
			ResultSet resultat4 = preparedStatement4.executeQuery();
			if (resultat4.next()) {
				int nbreFriends = resultat4.getInt("nbreOfFriends");
				user.setNbreFriends(nbreFriends);

			} else {
				int nbreFriends = 0;
				user.setNbreFriends(nbreFriends);
			}
			users.add(user);

		}

		return users;
	}

	// ADD A FRIENDSHIP && CHECK IF THEY ARE FRIENDS :
	public void addFriend(int idUser1, int idUser2) throws SQLException {
		driver();
		PreparedStatement preparedStatement5 = connexion
				.prepareStatement("INSERT INTO friendships(id_user1,id_user2) VALUES (?,?)");
		preparedStatement5.setInt(1, idUser1);
		preparedStatement5.setInt(2, idUser2);

		preparedStatement5.executeUpdate();

	}

}
