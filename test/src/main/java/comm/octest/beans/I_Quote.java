package comm.octest.beans;

import java.sql.SQLException;

//QUOTE == OBSERVABLE
public interface I_Quote {

	void addObservers(Observer user);

	void getObservers();

	void notifyObservers(int id_quote) throws SQLException;

	Flyweight addQuote(String name_book, String quote_text, int user_id) throws SQLException;

}
