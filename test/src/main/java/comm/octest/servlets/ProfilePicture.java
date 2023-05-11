package comm.octest.servlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProfilePicture", value = "/profilePicture")
public class ProfilePicture extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int id_user = (Integer) session.getAttribute("user_id");
		String filePath = "/WEB-INF/ressources/uploads/" + id_user;
		// Create a File object with the file path
		File file = new File(getServletContext().getRealPath(filePath));
		System.out.println("file Path:  "+filePath) ;
		
		if (file.exists()) {
		    // File exists, serve it to the client
		
			

			this.getServletContext().getRequestDispatcher("/WEB-INF/ressources/uploads/"+id_user).forward(request,
					response);
		   
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/ressources/uploads/profile.png").forward(request,response);
		}

	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
