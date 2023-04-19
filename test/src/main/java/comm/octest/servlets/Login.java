package comm.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.octest.beans.User;
import comm.octest.db.pseudo;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CREATION DUN OBJET USER
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();
		user.setEmail(email);
		user.setPassword(password);

		// AUTHENTIFICATION
		pseudo pseudo = new pseudo();
		boolean auth = pseudo.authentification(user);
		request.setAttribute("auth", auth);

		// SESSION :
		if (auth) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp?error=1").forward(request, response);
		}

	}

}