package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

public interface Observer {
	void update(int id_quote) throws SQLException;

	String getEmail();

	void setEmail(String string);

	void setPassword(String password);

	String getPassword();

	boolean authentification();

	List<User> getInfo(String email, int idUserConnected) throws SQLException;

	void setCity(String city);

	void setName(String name);

	String getName();

	String getCity();

	void setId_user(int id_user);

	void setCountry(String country);

	boolean updateUserInfo(Observer user, String email_session) throws SQLException;

	String getCountry();

	int getId_user();

	void setId_quote(int quote_id);

	void likedQuote(Observer user) throws SQLException;

	int getId_quote();

	public boolean equals(Object o);

	public int hashCode();

	void setNbreQuoteAdded(int nbreQuoteAdded);

	int getNbreQuoteAdded();

	List<Observer> getUsers(int idUserConnected) throws SQLException;

	void addFriend(int idUser1, int idUser2) throws SQLException;

	void setFriends(boolean isFriends);

	boolean isFriends();

	void setNbreFriends(int nbreFriends);

	int getNbreFriends();

	void setNbreLikes(int nbreLikes);

	int getNbreLikes();
}
