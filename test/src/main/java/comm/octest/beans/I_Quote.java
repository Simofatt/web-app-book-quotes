package comm.octest.beans;

import java.sql.SQLException;

//QUOTE == OBSERVABLE AND PROXY INTERFACE 
public interface I_Quote {

	Flyweight addQuote(String name_book, String quote_text,String author_name, int user_id) throws SQLException;

	void updateQuote(Flyweight quote) throws SQLException;

	void addUserIds() throws SQLException;

	void fetchQuotes(int user_id) throws SQLException;

 void putQuote(String key, Flyweight quote) ;

	void removeQuote(String key, QuoteManager quote);

	void addObservers(Observer user);

	void getObservers();

	void notifyObservers(int id_quote) throws SQLException;

	void removeObserver(Observer user);

}
