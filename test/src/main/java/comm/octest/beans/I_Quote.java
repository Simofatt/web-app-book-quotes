package comm.octest.beans;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

//QUOTE == OBSERVER
public interface I_Quote {

	List<Quote> fetchQuotes() throws SQLException;

	void save() throws SQLException;

	List<Quote> fetchUserQuotes() throws SQLException;

	void saveUserQuote() throws SQLException;

	List<String> getLikedUsers();

	void addLikedUser(String userId, int id_quote, int id_user);

	void removeLikedUser(String userId);

	void notifyLikedUsers(int id_quote, int id_user);

	void display(String user);

	void likeQuote(int user_id, int id_quote);

	void setLikedUsers(List<String> likedUsers);

	String getName_book();

	void setName_book(String name_book);

	String getQuoteText();

	void setQuoteText(String quoteText);

	int getUserId();

	void setUserId(int userId);

	Timestamp getCreated_at();

	void setCreated_at(Timestamp created_at);
}