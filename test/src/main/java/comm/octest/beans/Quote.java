package comm.octest.beans;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import comm.octest.db.DAO;

public class Quote implements I_Quote {
	private String name_book;
	private String quote_text;
	private int user_id;
	private Timestamp created_at;
	private String author_name;
	private String user_name;

	// private List<Observer> observers;
	private List<String> likedUsers = new ArrayList<>();

	public Quote() {
	};

	public Quote(String name_book, String quoteText, int userId) {
		this.name_book = name_book;
		this.quote_text = quoteText;
		this.user_id = userId;
	}

	public Quote(String quote_text, int user_id) {
		this.user_id = user_id;
		this.quote_text = quote_text;

	}

	public Quote(String name_book, String quoteText, String author_name, Timestamp created_at, String user_name) {
		this.name_book = name_book;
		this.quote_text = quoteText;
		this.author_name = author_name;
		this.created_at = created_at;
		this.user_name = user_name;
	}

	// FETCH ALL THE QUOTES
	public List<Quote> fetchQuotes() throws SQLException {
		DAO dao = new DAO();
		List<Quote> quotes = dao.fetchQuotes();
		return quotes;
	}

	// FETCH MY QUOTES
	public List<Quote> fetchMyQuotes(String email_user) throws SQLException {
		DAO dao = new DAO();
		List<Quote> quotes = dao.fetchMyQuotes(email_user);

		return quotes;
	}

	public void save() throws SQLException {
		DAO pseudo = new DAO();
		pseudo.insertQuote(name_book, quote_text);
		System.out.println("Book bien saisie ! " + name_book);
	}

	public List<Quote> fetchUserQuotes() throws SQLException {
		DAO dao = new DAO();
		List<Quote> user_quote = dao.fetchUserQuote();
		return user_quote;
	}

	public void saveUserQuote() throws SQLException {
		DAO pseudo = new DAO();
		pseudo.insertUserQuote(quote_text, user_id);

	}

	public List<String> getLikedUsers() {
		return likedUsers;
	}

	@Override
	public void addLikedUser(String userId, int id_quote, int id_user) {
		if (!likedUsers.contains(userId)) {
			likedUsers.add(userId);
		}
		notifyLikedUsers(id_quote, id_user);
	}

	@Override
	public void removeLikedUser(String userId) {
		likedUsers.remove(userId);
	}

	@Override
	public void notifyLikedUsers(int id_quote, int id_user) {
		// SQL SEQUEST TO ADD IN TH NOTIICATION TABLE
	}

	@Override
	public void display(String user) {
		System.out.println("Quote by " + name_book + " in " + ": " + quote_text);
		// System.out.println("Added by user " + user);
	}

	@Override
	public void likeQuote(int user_id, int id_quote) {
		// TODO Auto-generated method stub

	}

	// GETTERS AND SETTERS

	public void setLikedUsers(List<String> likedUsers) {
		this.likedUsers = likedUsers;
	}

	public String getName_book() {
		return name_book;
	}

	public void setName_book(String name_book) {
		this.name_book = name_book;
	}

	public String getQuoteText() {
		return quote_text;
	}

	public void setQuoteText(String quoteText) {
		this.quote_text = quoteText;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int userId) {
		this.user_id = userId;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
