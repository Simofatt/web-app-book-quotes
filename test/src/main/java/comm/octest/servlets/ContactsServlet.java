package comm.octest.servlets;

import comm.octest.db.pseudo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ContactsServlet", value = "/ContactsServlet")
public class ContactsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");

		pseudo pseudo = new pseudo(email);

		ArrayList<String> contacts = pseudo.getContacts();
		request.setAttribute("contacts", contacts);

		this.getServletContext().getRequestDispatcher("/WEB-INF/contacts.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
