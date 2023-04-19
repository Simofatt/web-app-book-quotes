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

import comm.octest.beans.Quote;

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
			Quote quote = new Quote();
			try {
				List<Quote> quotes = quote.fetchMyQuotes(email);
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
		try {

			String author_name = request.getParameter("author_name");
			String name_book = request.getParameter("book_name");
			String idQuote = request.getParameter("id_quote");
			int id_quote = Integer.parseInt(idQuote);
			String quote_text = request.getParameter("quote_text");

			Quote quote2 = new Quote(name_book, quote_text, author_name, id_quote);
			quote2.updateQuote();

			// GET THE ID OF THE USER

			/*
			 * HttpSession session = request.getSession(); String email = (String)
			 * session.getAttribute("email");
			 * 
			 * 
			 * DAO pseudo = new DAO(); int user_id = pseudo.getId(email);
			 * 
			 * 
			 * String type = "policier"; Application app = new Application();
			 * app.updateQuote(name_book, quote_text, author_name, id_quote, user_id, type);
			 */

			System.out.println("UPDATE INFOS : name of the author :  " + author_name + "name of the book : " + name_book
					+ "Id_quote: " + id_quote);

			response.sendRedirect("myQuotes");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}