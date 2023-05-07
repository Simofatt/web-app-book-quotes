package comm.octest.beans;

import java.sql.SQLException;

//QUOTE == OBSERVABLE
public interface I_Quote {

	Flyweight addQuote(String name_book, String quote_text, int user_id) throws SQLException;

	void updateQuote(Flyweight quote) throws SQLException;

	void addUserIds() throws SQLException;

	void fetchQuotes(int user_id) throws SQLException;

 void putQuote(String key, Flyweight quote) ;

	void removeQuote(String key, QuoteManager quote);

	void addObservers(Observer user);

	void getObservers();

	void notifyObservers(int id_quote) throws SQLException;

}
