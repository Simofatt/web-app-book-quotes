package comm.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.octest.beans.User;
import comm.octest.db.DAO;

@WebServlet(name = "Auth", value = "/auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Auth() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();
		user.setEmail(email);
		user.setPassword(password);

		// AUTHENTIFICATION
		DAO dao = new DAO();
		boolean auth = dao.authentification(user);
		request.setAttribute("auth", auth);

		// SESSION :
		if (auth) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);

		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp?error=1").forward(request,
					response);
		}
	}

}
