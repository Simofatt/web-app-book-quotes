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

@WebServlet(name = "SharedQuotes", value = "/sharedQuotes")
public class SharedQuotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SharedQuotes() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		if (email != null) {

			Quote quote = new Quote();
			try {
				List<Quote> quotes = quote.fetchQuotes();
				request.setAttribute("quotes", quotes);

			} catch (SQLException e) {

				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/sharedQuotes.jsp").forward(request, response);
		} else {
			response.sendRedirect("registration");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}