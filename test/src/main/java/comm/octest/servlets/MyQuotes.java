package comm.octest.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.octest.beans.Flyweight;
import comm.octest.beans.QuoteManager;

@WebServlet(name = "MyQuotes", value = "/myQuotes")
public class MyQuotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyQuotes() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		if (email != null) {

			Flyweight quoteManager = new QuoteManager();
			try {
				List<QuoteManager> quotes = quoteManager.fetchMyQuotes(email);
				request.setAttribute("quotes", quotes);

			} catch (SQLException e) {

				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/myQuotes.jsp").forward(request, response);
		} else {
			response.sendRedirect("registration");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String author_name = request.getParameter("author_name");
		String name_book = request.getParameter("book_name");
		String idQuote = request.getParameter("id_quote");
		int id_quote = Integer.parseInt(idQuote);
		String quote_text = request.getParameter("quote_text");

		Flyweight quoteManager2 = new QuoteManager(name_book, quote_text, author_name, id_quote);
		updateQuote(quoteManager2);

		System.out.println("UPDATE INFOS : name of the author :  " + author_name + "name of the book : " + name_book
				+ "Id_quote: " + id_quote);

		response.sendRedirect("myQuotes");

	}

	private void updateQuote(Flyweight quote2) {
		// TODO Auto-generated method stub

	}

}
