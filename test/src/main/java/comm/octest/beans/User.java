package comm.octest.beans;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;

import comm.octest.dao.user.UserDAOImp;

// OBSERVER 
public class User implements Observer {

	private String full_name;
	private String email;
	private int id_user;
	private String country;
	private String password;
	private Timestamp created_at;
	private String profile_img;
	private QuoteFlyweight quoteManager ;
	private String city;  
	private int nbreQuoteAdded; 
	private boolean isFriends; // check is two users are friends
	private int nbreFriends; // check nbre Of friends that the user have
	private int nbreLikes;
	private UserDAOImp userDAO;

	public User() {
		userDAO = new UserDAOImp();
		quoteManager = new QuoteManager() ;
	}

	// CONTRUCTOR TO ADD A OBSERVER
	public User(String email, String password, I_Quote quoteFactory) {

		this.email = email;
		this.password = password;
		quoteFactory.addObservers(this);
		userDAO = new UserDAOImp();

	}

	// CONSTRUCTOR TO GET THE USER INFO
	public User(String name, String country, String city, String password, Timestamp created_at, String email,
			int nbreQuotes, int id_user, int nbreFriends, int nbre_likes, boolean isFriends) {
		this.full_name = name;
		this.country = country;
		this.city = city;
		this.created_at = created_at;
		this.password = password;
		this.email = email;
		this.nbreQuoteAdded = nbreQuotes;
		this.id_user = id_user;
		this.nbreFriends = nbreFriends;
		this.nbreLikes = nbre_likes;
		this.isFriends = isFriends;
		userDAO = new UserDAOImp();

	}
	
	
	//REGISTRATION : 
	
	public boolean validEmail(String email, String currentEmail) throws SQLException {
		boolean valide = userDAO.validEmail(email,currentEmail);
		return valide;
	}
	
	public boolean validerInput(String name, String email,String password,String passwordc) throws SQLException, ClassNotFoundException { 
		boolean uniq = userDAO.validerInput(name, email, password, passwordc);
		return uniq ;
	}
	
	public void registration(Observer user) throws SQLException { 
		userDAO.registration(user);
		
	}
	// AUTHENTIFICATION
	public boolean authentification() {
		boolean auth = userDAO.authentification(this);
		return auth;
	}

	//GET USER DATA
	public List<User> getInfo(String email, int idUserConnected) throws SQLException {
		List<User> userInfo = new ArrayList<>();
		userInfo = userDAO.getUser(email, idUserConnected);
		return userInfo;
	}

	//UPDATE USER INFOS
	public boolean updateUserInfo(Observer user, String email_session) throws SQLException {
		boolean valide = userDAO.validEmail(user.getEmail(), email_session);
		if (valide) {
			userDAO.updateUserInfo(user);
			return valide;
		}
		return valide;
	}

	
	//ADD A LIKE TO A QUOTE
	public void likedQuote(Observer user) throws SQLException {
		userDAO.addLikedQuote(user);
	}
	
	//REMOVE LIKE quote
	public void removeLikedQuote(Observer user) throws SQLException {
		userDAO.removeLikedQuote(user);

		// likedUsers.remove(userId);
	}

	// SEND NOTIFICATION TO USER
	public void update(int id_quote) throws SQLException {
		int id_user = userDAO.getId(this.email);
		System.out.print("ID DE LUSER EST : " + id_user + "ET SON EMAIL EST :" + this.email);
		userDAO.insertNotification(id_quote, id_user);
	}

	
	// FETCH POPULAR PEOPLE :
	public List<Observer> getUsers(int idUserConnected) throws SQLException {
		List<Observer> users = new ArrayList<>();
		users = userDAO.getUsers(idUserConnected);
		return users;
	}

	// ADD A FRIENDSHIP
	public void addFriend(int idUser1, int idUser2) throws SQLException {
		userDAO.addFriend(idUser1, idUser2);
	}

	//GET THE ID OF A USER BASED ON HIS EMAIL
	public int getIdUser(String email) throws SQLException { 
		int userId = userDAO.getId(email) ; 
		return userId ; 
	}
	
	public String hashPassword(String password) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("SHA-256");
	    byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
	    String encodedPassword = Base64.getEncoder().encodeToString(hashedPassword);
	    return encodedPassword;
	}

	
	
	
	// MEHTODES TO KNOW IF THERE IS AN INSTANCE OF THE USER IN THE LIST OF OBSERVERS
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Observer)) {
			return false;
		}
		Observer other = (Observer) o;
		return Objects.equals(email, other.getEmail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
	
	
	
	
	
	
	
	
	

	// ************************** GETTERS AND SETTERS****************************************
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public int getId_type() {
		return quoteManager.getId_type() ; 
		}

	public void setId_type(int id_type) {
	 quoteManager.setId_type(id_type);
	}

	public int getId_quote() {
		
		return quoteManager.getId_quote();
	}

	public void setId_quote(int id_quote) {

		quoteManager.setId_quote(id_quote);
		//this.id_quote = id_quote;
	}
 
	public String getName() {
		return full_name;
	}

	public void setName(String name) {
		this.full_name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNbreQuoteAdded() {
		return nbreQuoteAdded;
	}

	public void setNbreQuoteAdded(int nbreQuoteAdded) {
		this.nbreQuoteAdded = nbreQuoteAdded;
	}

	public boolean isFriends() {
		return isFriends;
	}

	public void setFriends(boolean isFriends) {
		this.isFriends = isFriends;
	}

	public int getNbreFriends() {
		return nbreFriends;
	}

	public void setNbreFriends(int nbreFriends) {
		this.nbreFriends = nbreFriends;
	}

	public int getNbreLikes() {
		return nbreLikes;
	}

	public void setNbreLikes(int nbreLikes) {
		this.nbreLikes = nbreLikes;
	}

}
