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

@WebServlet(name = "FavQuotes", value = "/favQuotes")
public class FavQuotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FavQuotes() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String email = (String) session.getAttribute("email");

			if (email != null) {
				int user_id = (int) session.getAttribute("user_id");

				Quote quote = new Quote();
				List<Quote> favQuotes = quote.fetchFavQuotes(user_id);
				request.setAttribute("favQuotes", favQuotes);

				this.getServletContext().getRequestDispatcher("/WEB-INF/favQuotes.jsp").forward(request, response);
			} else {
				response.sendRedirect("registration");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String quoteId = request.getParameter("quoteId");
			int quote_id = Integer.parseInt(quoteId);
			HttpSession session = request.getSession();
			int user_id = (int) session.getAttribute("user_id");

			Quote quote = new Quote();
			quote.setId_quote(quote_id);
			quote.setUserId(user_id);

			quote.removeLikedQuote(quote);
			response.sendRedirect("favQuotes");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
