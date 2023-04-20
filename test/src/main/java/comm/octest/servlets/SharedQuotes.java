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
import comm.octest.beans.User;

@WebServlet(name = "SharedQuotes", value = "/sharedQuotes")
public class SharedQuotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SharedQuotes() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String email = (String) session.getAttribute("email");
			int user_id = (int) session.getAttribute("user_id");
			if (email != null) {

				Quote quote = new Quote();
				List<Quote> quotes = quote.fetchQuotes(user_id);
				request.setAttribute("quotes", quotes);

				this.getServletContext().getRequestDispatcher("/WEB-INF/sharedQuotes.jsp").forward(request, response);
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
			User user = new User();
			user.setId_quote(quote_id);
			user.setId_user(user_id);
			user.likedQuote(user);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		response.sendRedirect("sharedQuotes");

	}

}
