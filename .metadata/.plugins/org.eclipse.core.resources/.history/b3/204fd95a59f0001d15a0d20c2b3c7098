package comm.octest.beans;

import java.sql.SQLException;

public class QuoteFactoryRunnable implements Runnable {
    private String name_book;
    private String quote_text;
    private int userId;
    private QuoteFactory quoteFactory;

    public QuoteFactoryRunnable(String name_book, String quote_text, int userId, QuoteFactory quoteFactory) {
        this.name_book = name_book;
        this.quote_text = quote_text;
        this.userId = userId;
        this.quoteFactory = quoteFactory;
    }

    @Override
    public void run() {
        // call the addQuote method in the quoteFactory instance
        try {
			quoteFactory.addQuote(name_book, quote_text, userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}