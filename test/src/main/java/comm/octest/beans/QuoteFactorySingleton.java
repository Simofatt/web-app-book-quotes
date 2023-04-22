package comm.octest.beans;

public class QuoteFactorySingleton {
	private static I_Quote quoteFactory = new QuoteFactory();

	public static synchronized I_Quote getInstance() {
		if (quoteFactory == null) {
			quoteFactory = new QuoteFactory();
		}
		return quoteFactory;
	}

}