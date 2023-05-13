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

import comm.octest.beans.Observer;
import comm.octest.beans.User;

@WebServlet(name = "People", value = "/people")
public class People extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public People() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String email = (String) session.getAttribute("email");
				if (email != null) {
						Observer user = new User();
						
						//WE GET THE IdUserConnected TO KNOW IF HIM AND THE PEOPLE THAT WE FETCH ARE FRIENDS OR NOT 
						int idUserConnected = (Integer) session.getAttribute("user_id");
						List<Observer> users = user.getUsers(idUserConnected);
						request.setAttribute("users", users);
						
					    this.getServletContext().getRequestDispatcher("/WEB-INF/people.jsp").forward(request, response);
							        
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
			HttpSession session = request.getSession();
			int idUser1 = Integer.parseInt(request.getParameter("addFriend"));
			int idUser2 = (Integer) session.getAttribute("user_id");
			Observer user = new User();
			user.addFriend(idUser1, idUser2);
			response.sendRedirect("people");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
