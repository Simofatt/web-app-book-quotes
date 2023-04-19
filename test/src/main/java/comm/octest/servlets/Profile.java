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

@WebServlet(name = "Profile", value = "/profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Profile() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		if (email != null) {
			User user = new User();
			Quote quote = new Quote();
			try {
				List<Quote> quotes = quote.fetchMyQuotes(email);
				request.setAttribute("quotes", quotes);
				List<User> userInfo = user.getInfo(email);
			
				request.setAttribute("userInfo", userInfo);
				

			} catch (SQLException e) {

				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
		} else {
			response.sendRedirect("registration");
		}
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}