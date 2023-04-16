package comm.octest.servlets;

import comm.octest.beans.User;
import comm.octest.db.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Registration", value = "/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("full_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passwordc = request.getParameter("passwordc");

		User user = new User();

		user.setEmail(email);
		user.setPassword(password);
		user.setName(name);

		DAO pseudo = new DAO();

		boolean uniq = false;
		try {
			uniq = pseudo.validerInput(name, email, password, passwordc);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		if (uniq) {
			pseudo.registration(user);
			response.sendRedirect("auth");
		} else {
			response.sendRedirect("registration");
		}

	}

}
