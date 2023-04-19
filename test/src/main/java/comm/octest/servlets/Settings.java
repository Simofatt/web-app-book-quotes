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

import comm.octest.beans.User;
import comm.octest.db.DAO;

@WebServlet(name = "Settings", value = "/settings")
public class Settings extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Settings() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		if (email != null) {
			User user = new User();

			try {

				List<User> userInfo = user.getInfo(email);
				request.setAttribute("userInfo", userInfo);

			} catch (SQLException e) {

				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/settings.jsp").forward(request, response);
		} else {
			response.sendRedirect("registration");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email_session = (String) session.getAttribute("email");
		DAO pseudo = new DAO();
		String full_name = request.getParameter("full_name");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String password = request.getParameter("password");

		try {

			User user = new User();
			List<User> userInfo = user.getInfo(email_session);
			int id_user = pseudo.getId(email_session);

			user.setId_user(id_user);
			if (full_name != null && !full_name.isEmpty()) {
				user.setName(full_name);
			} else {
				user.setName(userInfo.get(0).getName()); // set the current value of name in the database
			}
			if (email != null && !email.isEmpty()) {
				user.setEmail(email);
				boolean valide = pseudo.validEmail(email, email_session);
				if (valide) {
					session.setAttribute("email", email);
				}

			} else {
				user.setEmail(email_session);
			}
			if (city != null && !city.isEmpty()) {
				user.setCity(city);
			} else {
				user.setCity(userInfo.get(0).getCity());
			}
			if (country != null && !country.isEmpty()) {
				user.setCountry(country);
			} else {
				user.setCountry(userInfo.get(0).getCountry());
			}
			if (password != null && !password.isEmpty()) {
				user.setPassword(password);
			} else {
				user.setPassword(userInfo.get(0).getPassword());
			}

			boolean emailValide = user.updateUserInfo(user, email_session);
			System.out.println(emailValide);
			System.out.println(userInfo.get(0).getPassword());

			if (emailValide) {
				response.sendRedirect("settings");
			} else {
				request.setAttribute("userInfo", userInfo);
				this.getServletContext().getRequestDispatcher("/WEB-INF/settings.jsp?error=1").forward(request,
						response);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
