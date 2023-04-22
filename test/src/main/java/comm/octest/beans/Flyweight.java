package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

public interface Flyweight {

	String getAuthor_name();

	String getName_book();

	String getQuoteText();

	int getId_quote();

	List<QuoteManager> fetchQuoteAuthorship() throws SQLException;

	int insertQuote() throws SQLException;

	int insertQuoteAuthorship() throws SQLException;

	List<QuoteManager> fetchQuotes(int user_id) throws SQLException;

	void updateQuote(Flyweight quote) throws SQLException;

	void setName_book(String name_book);

	void setQuoteText(String quote_text);

}
