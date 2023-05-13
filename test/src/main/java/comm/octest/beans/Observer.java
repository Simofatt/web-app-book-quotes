package comm.octest.beans;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

public interface Observer {
	void update(int id_quote) throws SQLException;

	boolean authentification();

	List<User> getInfo(String email, int idUserConnected) throws SQLException;

	boolean updateUserInfo(Observer user, String email_session) throws SQLException;

	void likedQuote(Observer user) throws SQLException;

	public boolean equals(Object o);

	List<Observer> getUsers(int idUserConnected) throws SQLException;

	void removeLikedQuote(Observer user) throws SQLException;

	void registration(Observer user) throws SQLException;

	boolean validEmail(String email, String currentEmail) throws SQLException;

	String hashPassword(String password) throws NoSuchAlgorithmException;

	boolean validerInput(String name, String email, String password, String passwordc)
			throws SQLException, ClassNotFoundException;

	void addFriend(int idUser1, int idUser2) throws SQLException;

	public int hashCode();

	String getEmail();

	void setEmail(String string);

	void setPassword(String password);
	
	void setProfile_img(String profile_img);
	
	String getProfile_img() ;

	String getPassword();

	void setCity(String city);

	void setName(String name);

	String getName();

	String getCity();

	void setId_user(int id_user);

	void setCountry(String country);

	String getCountry();

	int getId_user();

	void setId_quote(int quote_id);

	int getId_quote();

	void setNbreQuoteAdded(int nbreQuoteAdded);

	int getNbreQuoteAdded();

	void setFriends(boolean isFriends);

	boolean isFriends();

	void setNbreFriends(int nbreFriends);

	int getNbreFriends();

	void setNbreLikes(int nbreLikes);

	int getIdUser(String email) throws SQLException;

	int getNbreLikes();
	void getAllUsers() throws SQLException;

}
