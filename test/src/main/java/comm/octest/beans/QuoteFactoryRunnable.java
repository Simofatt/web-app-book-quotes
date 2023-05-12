package comm.octest.beans;

import java.sql.SQLException;

public class QuoteFactoryRunnable implements Runnable {
    private String name_book;
    private String quote_text;
    private int userId;
    private String author_name;
    private QuoteFactory quoteFactory;

    public QuoteFactoryRunnable(String name_book, String quote_text,String author_name, int userId, QuoteFactory quoteFactory) {
        this.name_book = name_book;
        this.quote_text = quote_text;
        this.userId = userId;
        this.quoteFactory = quoteFactory;
        this.author_name = author_name ;
    }

    @Override
    public void run() {
        // call the addQuote method in the quoteFactory instance
        try {
			quoteFactory.addQuote(name_book, quote_text, author_name,userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}